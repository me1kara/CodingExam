package Eaxm;

import java.util.stream.IntStream;

public class Eaxm25 {
	
	public static void main(String[] args) {
		
	}
	
	/*
	 * 25-1
	 * 문자열 "hello"에서 각 문자를 오른쪽으로 한 칸씩 밀고 마지막 문자는 맨 앞으로 이동시키면 "ohell"이 됩니다. 
	 * 이것을 문자열을 민다고 정의한다면 문자열 A와 B가 매개변수로 주어질 때, A를 밀어서 B가 될 수 있다면 
	 * 밀어야 하는 최소 횟수를 return하고 밀어서 B가 될 수 없으면 -1을 return 하도록 solution 함수를 완성해보세요.
	 * 
	 */
	
    public int solution25_1(String A, String B) {
        int answer = -1;
        int length = A.length();
        for(int i=0;i<length;i++){
            if(A.equals(B)){
                return i;
            }
            char lastChar = A.charAt(length-1);
            String subStr = A.substring(0,length-1);
            A = Character.toString(lastChar)+subStr;
        }
        
        // 다른 사람 풀이
        // return (B+B).indexOf(A);
        // return B.repeat(3).idnexOf(A);
        // ex : 호날두호날두, 호날두/날두호/두호날
        
        return answer;
    }
    
    /*
     25-2
     머쓱이는 큰 종이를 1 x 1 크기로 자르려고 합니다. 
     예를 들어 2 x 2 크기의 종이를 1 x 1 크기로 자르려면 최소 가위질 세 번이 필요합니다.
	 정수 M, N이 매개변수로 주어질 때, M x N 크기의 종이를 최소로 가위질 해야하는 횟수를 
	 return 하도록 solution 함수를 완성해보세요.
     */
    
    
    public int solution25_2(int M, int N) {        
        return M==1&&M==N ? 0:M-1+((N-1)*M);
        //다른 사람 return M*N-1;
    }
    /*
     25-3
     연속된 세 개의 정수를 더해 12가 되는 경우는 3, 4, 5입니다. 
     두 정수 num과 total이 주어집니다. 
     연속된 수 num개를 더한 값이 total이 될 때, 
     정수 배열을 오름차순으로 담아 return하도록 solution함수를 완성해보세요.
    */
    
    public int[] solution25_3(int num, int total) {
        int[] answer = {};
        int count = total/num;
        int n = (num -1)/2;
        if(num%2==0){
            answer = IntStream.rangeClosed(count-n,count+n+1).toArray();
        }else{
            answer = IntStream.rangeClosed(count-n,count+n).toArray();
        }
        
        return answer;
    }
    /*
    25_4
    등차수열 혹은 등비수열 common이 매개변수로 주어질 때, 
    마지막 원소 다음으로 올 숫자를 return 하도록 solution 함수를 완성해보세요.
     */
    public int solution25_4(int[] common) {
        int answer = 0;
        int length = common.length-1;
        //등차
        if(common[1]-common[0]==common[2]-common[1]){
          int cha = common[1]-common[0];
          answer = common[length]+cha;
        }else{
        //등비
          int cha = common[1]/common[0];
          answer = common[length]*cha;
        }
        return answer;
    }
    
    

}
