package exam;

public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 아래 숫자들을 모두 곱한 값을 배열을 사용하여 출력하시오
		//1 2 3 4 5
		int[] num = {1, 2, 3, 4, 6};
		int sum = 1;
		for (int i = 0; i < num.length; i++) {
			sum = sum *num[i];
		}
		System.out.println(sum);
	}

}
