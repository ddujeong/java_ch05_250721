package exam;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 다음 값 들의 평균을 계산하여 출력하시오 (향상된 for 문)
		// 90,80,70,100,85
		
		int[] num = {90, 80, 70, 100, 85};
		int sum = 0;
		for(int number : num) {
			sum = sum + number;
	}
		System.out.println("총 합 : " + sum);
		double avg = (double) sum / num.length;
		System.out.println("평균 : " + avg);
}
}