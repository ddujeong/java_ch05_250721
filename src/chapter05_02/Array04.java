package chapter05_02;

public class Array04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[] intArr = {10, 20, 30, 40, 50};
		
		//1차원 배열
		int[][] arr = new int [4][3]; 
		// 4행 3열의 2차원 배열 선언과 초기화
		// 0으로 초기화 되어있음
		// 2차원 배열은 선언과 초기화 따로 가능?????!!!
		
		System.out.println(arr[0][0]);
		int[][] arr2 = {
						{10,20},
						{30,40},
						{50,60}
		};  // 2차원 배열 선언과 동시에 특정값으로 초기화{{},{},{}}
		
		System.out.println(arr2[2][1]);
		// 60
		
		// for문을 사용하여 2차원 배열의 모든 원소 출력
		for(int i = 0; i<arr2.length; i++) {// 행 
			for (int j = 0; j<arr2[i].length; j++){// 열  
				System.out.println(arr2[i][j]);
		// 10 20 30 40 50 60 
			}
			
		
	}
	}
}
