package exam;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 다음 숫자들을 거꾸로 출력하시오.
		// 10, 20 , 30 , 40 , 50
		int[] num = {10, 20, 30, 40, 50};
		
//		for(int i = 4;i <num.length; i--) {
//			
//			System.out.println(num[i]);
//		}
		// 오류 날 수도 있음
		
		for(int i = num.length -1; i >=0; i--) {
			System.out.println(num[i]);
		}
		
	}

}
