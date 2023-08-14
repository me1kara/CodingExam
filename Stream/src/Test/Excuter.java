package Test;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Excuter {

	public static void main(String[] args) {

		//배열 스트림
		String[] strA = {"1","21","31"};
		Stream<String> strS = Arrays.stream(strA);
		//컬렉션 스트림
		List<Integer> intL = Arrays.asList(1,2,3);
		Stream<Integer> intS = intL.stream();
		
		
//		Map<String, Integer> sIM = new HashMap();
//		sIM.put("첫째", 1);
//		
//		while(sIM.entrySet().iterator().hasNext()){
//			Entry<String,Integer> en = sIM.entrySet().iterator().next();
//		}
		
		//무작위 데이터
		Stream randomS = Stream.of("하이",1,"요");
		//intStream
		int sum = IntStream.range(2, 5).sum(); //from 2 to 5 , 5제외
		//System.out.println(sum); //9
		
		//iterator
		Stream<Integer> iterS = Stream.iterate(30, n -> n+2).limit(5);
		Stream<Integer> iterPS = Stream.iterate(30, n -> n+2).limit(5).parallel();
		
		//a는 계산결과, b는 요소, 인자가 하나일 경우
		//Integer hap = iterS.reduce((a,b) -> {System.out.println(b); return Integer.sum(a, b);}).get();
		//System.out.println(hap); 170
		
		//인자가 둘인 경우 초기값 10에 중간결산 sum을 더한 것
		//Integer hap = iterS.reduce(10,(a,b)->{System.out.println(a); return a+b;}); // a는 10더하기 요소
		//System.out.println(hap); //180
		
		//인자가 셋인 경우,병렬스트림에만 적용됨
		
		Integer s = iterPS.reduce(10,Integer::sum,(a,b)->{System.out.println("called"); return a+b;});
		System.out.print(s);//230 180에 다시 10이 5번 더해진 것 그러니까 인자 두개는 초기값 10을 한 번만 더하지만
		//인자 세 개는 요소마다 10을 더해서 총 5번 더한 것
	
				
		//iterS.forEach(System.out::println); //30 32 34 36 38
	
		

		
//		List<String> strL = strS.filter(item -> item.length()>1).collect(Collectors.toList());
//		strL.forEach(item -> System.out.println(item)); // 예상21,31
	
//		String strResult = strS.filter(item -> item.length()>1).collect(Collectors.joining(", ","<",">"));
//		System.out.println(strResult); // <21, 31>
		
//		strS.forEach(System.out::println); // 1,21,31
		
	
		

			
		

	}

}
