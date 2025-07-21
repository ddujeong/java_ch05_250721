package exam;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 아래 배열에서 홀수인덱스의 값만 출력하시오.
		//10, 20, 30, 40, 50
		
		int[] num = {10,20,30,40,50};
		for(int i = 0;i<num.length; i++) {
			if (i % 2 == 1) {
				System.out.println(num[i]);
			}
		
		}
	}

}
