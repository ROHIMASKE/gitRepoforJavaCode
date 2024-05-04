package javaPackage;

public class fibonaci_Series {
public static void main(String[] args) {
	int num=5;
	int f=0,s=1,t=0;
	System.out.println(f);
	System.out.println(s);
	for(int i=2;i<num;i++)
	{
		t=f+s;
		System.out.println(t);
		f=s;
		s=t;
	}
}
}
