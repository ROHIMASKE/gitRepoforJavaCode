package javaPackage;

import java.util.HashSet;
import java.util.TreeSet;

public class findduplicatesfromtwoStringandplaceAsceding {
	public static void main(String[] args) {
		String str = "Welocome to Home";
		String str1 = "Hello World";
		char[] array1 = str.toCharArray();
		char[] array2 = str1.toCharArray();
		//System.out.println(array1);
		//System.out.println(array2);
		HashSet<Character> set1 = new HashSet<Character>();
		HashSet<Character> set2 = new HashSet<Character>();
		TreeSet<Character> duplicate = new TreeSet<Character>();
		// add charcter first to to set1
		for (char c : array1) {
			set1.add(c);

		}
		// add character string to second set2
		for (char c : array2) {
			set2.add(c);
		}
		for (char c : set1) {
			if (set2.contains(c)) {
				duplicate.add(c);

			}
		}
		System.out.println("Duplicate value from the given strings in ascending order");
		for (char c : duplicate) {
			System.out.print(c + " ");
		}

	}
}
