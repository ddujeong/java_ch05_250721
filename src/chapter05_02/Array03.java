package chapter05_02;



public class Array03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 사용 시 주의 사항 error 주의!!
		
		int[] intArr = {10, 20, 30, 40, 50};
		
		// System.out.println(intArr[5]);
		// intArr[5] = 300;
		// 위 둘 다 out of bounds error
		
		intArr[2] = 300;
		System.out.println(intArr[2]);
		// 300
		
		/*for(int i= 0; i<=5; i++) {
			System.out.println(intArr[i]);
		}*/
		// 마찬가지 out of bounds error i <= 5 떼문에
		
		String str1 = "kor";
		System.out.println(str1 + 7777);
		// kor7777  문자열로 바뀌어서 출력
		// 문자열과 다른타입 을 + 연산자로 결합하면 자동으로 문자열로 변환

		String[] strArr = {"Kor","Jap","USA"};
		System.out.println(strArr[1] + 7777);
		// Jap7777 문자열로 바뀌어서 출력
		
		String[] strArr2 = new String[5];
		System.out.println(strArr2[1] + 7777);
		// null7777 문자열로 바뀌어서 출력
		

		int[] intArr2 = {60, 70, 80, 90, 100};
		// 배열 요소가 5개
		System.out.println(intArr2.length);
		// 배열 요소의 갯수를 반환(갯수 알아냄)
		
		for (int i = 0; i < intArr2.length; i++) {
			System.out.println(intArr2[i]);
			// 갯수 모를때 i < intArr2.length 사용
			// 배열 요소의 갯수(베열의 길이) 만큼만 반복되는 for문
		}
	}

}
