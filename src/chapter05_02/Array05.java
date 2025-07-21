package chapter05_02;

public class Array05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 향상된 for 문 (배열, 컬렉션)
		
		int[] arr = {10, 20, 30, 40,50};
		// 모든 배열 요소를 출력하는 for문을 작성하세요.
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);			
		}
		
		// 향상된 for문으로 전환
		
		for(int num :arr) {
			System.out.println(num);	
		}
		
		// 다음 배열의 모든 요소 중 짝수만 출력하시오
		
		int[] numArr = {10,20,30,11,22,33,44,55};
		
		for(int num : numArr) {
			if (num % 2 ==0) {
				System.out.println(num);
				// num 은 지역변수
			}
		}
		
	}

}
