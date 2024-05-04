package javaPackage;

public class palindrome {
public static void main(String[] args) {
	String str="kiran";
	String rev="";
	for(int i=str.length()-1;i>=0;i--)
	{
		
		rev=rev+str.charAt(i);
	}
		if(str.equals(rev))
		{
			System.out.println("given String is an Palindrom");
		}
		else
		{
			System.out.println("Given string not an palindrome");
		}
	}
}