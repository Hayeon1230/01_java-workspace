package test.controller;

public class Test6 {

	public static void main(String[] args) {
		int[] arr = {1,4,71,23,6,8,19,201,12,11};
		double num = 0;
		double sum = 0;
		
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 2 == 0) {
				continue;
			}
			System.out.println(arr[i]);
			num += 1;
			sum += arr[i];
		}
		System.out.printf("더해진 갯수 : %.0f\n", num);
		System.out.printf("합계 : %.0f\n", sum);
		System.out.printf("평균 : %.1f", sum/num);
	}

}
