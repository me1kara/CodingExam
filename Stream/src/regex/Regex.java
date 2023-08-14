package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {
		
		String onlyNumber = "^[\\d]?$";	
		String number="1";
			
		System.out.println("결과:"+Pattern.matches(onlyNumber, number)+"\t"+number+","+onlyNumber);
		
		
		//이메일
		String emailRetex = "^\\w+@\\w+\\.\\w+(\\.\\w+)?$";
		String email = "asd@asd.co.kr";
		System.out.println(email.matches(emailRetex)); //espect true
		
		//전화번호
		String phoneReget = "^\\d{2,3}-\\d{3,4}-\\d{3,4}$";
		String phoneNumber = "010-111-1111";
		System.out.println(phoneNumber.matches(phoneReget));
		
		//휴대번호
		String phoneRegex2 = "^01(0|1)?-\\d{3,4}-\\d{4}";;
		String phoneNumber2 = "012-2222-2222";
		
		System.out.println(phoneNumber2.matches(phoneRegex2));
		
		// ^시작, &끝
		// ? 있는지없는지, +있어야만하며 여러개 가능, * 있든 없든 숫자가 많아도 모두 가능
		// \\d 숫자만, \\w 문자+숫자 둘다 가능, \\s는 공백
		// {n} : 갯수, (그룹), [괄호 안의 문자가 있는지 확인] {n,m} n이상 m이하
		// ?: 캡쳐하지 않음
		
		//matcher 확인
		
		String im = "나는 (새|감자|강아지) 입니다";
		
		
		
		Matcher matcher = Pattern.compile(im).matcher("나는 새 입니다");
		System.out.println("결과:"+matcher.find()+" 데이터:"+matcher.group());
		
		boolean asd = "나는 새 입니다".matches(im);
		System.out.println(asd);
	}
	

}
