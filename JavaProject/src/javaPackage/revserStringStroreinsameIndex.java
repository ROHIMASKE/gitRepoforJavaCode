package javaPackage;

public class revserStringStroreinsameIndex {
public static void main(String[] args) {
	String str="Welcome to Home";
String[] ar= str.split(" ");
for(int i=0;i<=ar.length-1;i++)
{
	
	String s1=ar[i];
	ar[i]=reversestring(s1);
	
}
for(int i=0;i<=ar.length-1;i++)
{
	System.out.print(ar[i]+" ");
}}
public static String reversestring(String inp)
{
	String rev="";
	for(int i=inp.length()-1;i>=0;i--)
	{
		rev=rev+inp.charAt(i);
	}
	return rev;
	
}

}
