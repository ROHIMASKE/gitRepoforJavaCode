package javaPackage;

public class string_ContainVowels {
public static void main(String[] args) {
	System.out.println(stringcontainsVowels("rohi"));
	System.out.println(stringcontainsVowels("pddd"));
	
}
public static boolean stringcontainsVowels(String input)
{
	 return input.toLowerCase().matches(".*[aeiou]*.");
}

}

