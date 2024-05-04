package javaPackage;

public class swappingNumber {
public static void main(String[] args) {
	/*
	 * int a=10; int b=200; System.out.println("before swapping value of a:"+a);
	 * System.out.println(" before swapping value of b:"+b); a=a+b; b=a-b; a=a-b;
	 * System.out.println("after swapping value of a:"+a);
	 * System.out.println(" after swapping value of b:"+b);
	 */
	String str="Rohi";
	String str1="Maske";
	System.out.println("before swapping :"+str);
	System.out.println("Before swapping :"+str1);
	str=str+str1;
	str1=str.substring(0,str.length()-str1.length());
	str=str.substring(str1.length());
	System.out.println("after swapping :"+str);
	System.out.println("after swapping :"+str1);
	
}
}
