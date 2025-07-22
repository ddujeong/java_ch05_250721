package exam;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 다음 숫자열에서 3의 갯수가 몇개인지 출력하시오
		//1,3,7,3,3,5,3,6,9,3,3,3
		int[] num = {1, 3, 7, 3, 3, 5, 3, 6, 9, 3, 3, 3}; 
		int count = 0;
			for(int i = 0; i< num.length; i++) {
				if (num[i] == 3) {
					count++;
				}
			}
			System.out.println(count);
	
//			for(int number : num) {
//				if (num == 3) {
//					count++;
//				}
			// 향상된 for문 사용하면 더 깔끔
//			}
			
	}

}
