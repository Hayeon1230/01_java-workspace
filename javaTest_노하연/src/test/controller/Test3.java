package test.controller;

public class Test3 {

	public static void main(String[] args) {
		int i = 1;
		double sum = 0;
		while(i>=1 &&i <= 100) {
			
			sum += i;
			i++;
		}
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + sum/100);
	}

}
