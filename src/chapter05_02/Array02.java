package chapter05_02;

public class Array02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr1 = {100, 200, 300, 400, 500};
		
		for(int i = 0; i<5 ; i++) {//베열 numArr1 의 모든 원소 출력하기
			System.out.println(numArr1[i]);
		}
		
		System.out.println("==========================");
		
		//배열 numArr1의 모든 요소의 합을 구하시오.
		int sum = 0;
		for(int i=0; i<5; i++ ) {
			sum = sum + numArr1[i];
	
		}
		System.out.println(sum);
	}

}
