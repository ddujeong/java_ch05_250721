package chapter05_02;

public class Array01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int score = 100;
//		double avg =95.2;
//		String str = "korea";
		// 베열 선언 방법
		
		// 배열은 선언과 동시에 초기화값 지정해야함
		int[] intArr =  {10, 20, 30, 40, 50};
		double[] doubleArr= {0.1, 0.2, 0.3, 0.4, 0.5};
		String[] strArr = {"Kor", "Jap", "USA"};
		boolean[] flagArr = {true, false, true, true};  // 잘안씀
		// [] = index
		
		//베열의 크기만 지정 후 기본값으로 초기화
		int[] intArr2 =  new int[5]; // 4바이트(정수형) 방이 5개 만들어짐 -> 0으로 초기화
		// => int[] intArr2 = {0, 0, 0, 0, 0};
		intArr2[0] = 100;
		intArr2[1] = 40;
		intArr2[2] = 60;
		intArr2[3] = 70;
		intArr2[4] = 80;
		
		double[] doubleArr2= new double[3];
		// => double[] doubleArr2 = {0.0, 0.0, 0.0}
		String[] strArr2 = new String[3];
		// => String[] strArr = {null, null, null}
		boolean[] flagArr2 = new boolean[4];
		// => boolean[] flagArr2 = {false, false, false, false,};
		// true == 1 , false == 0
		
		//new 연산자를 사용하여 배열 선언과 동시에 초기화 
		int[] intArr3 =  new int[] {1, 2, 3, 4, 5, 6};
		double[] doubleArr3= new double[] {0.1, 0.2, 0.3, 0.4, 0.5};
		String[] strArr3 = new String[] {"aaa", "bbb", "ccc"};
		boolean[] flagArr3 =new boolean[] {true, false, false, true};
		
	System.out.println(intArr2[4]);

	}

}
