package javaPackage;

public class ascending_array {
	public static void main(String[] args) {

		int ar[] = { 129, 199, 991, 991, 123, 1, 11, 23, 222 };
		int temp=0;
		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] > ar[j]) {
			  temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}}
			for (int i = 0; i < ar.length; i++) {
				System.out.print(ar[i]+",");
			}
		}

	}

