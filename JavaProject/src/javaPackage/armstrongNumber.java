package javaPackage;

public class armstrongNumber {
	public static void main(String[] args) {
		int num = 153;
		int sum = 0;
		for (int i = num; i > 0; i = i / 10) {
			int rem = i % 10;
			sum = (rem * rem * rem) + sum;
		}
		if (sum == num) {
			System.out.println("Given number is an armstrong number");

		} else {
			System.out.println("Given number is not an Armstrong number");

		}
	}
}
