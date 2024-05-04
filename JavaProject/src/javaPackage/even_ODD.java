package javaPackage;

public class even_ODD {
public static void main(String[] args) {
	int ar[]= {12,23,45,33,56,33,123,1,2,4};
	for (int i:ar)
	{
		System.out.print(i+",");
	}
	for(int i=0;i<=ar.length-1;i++)
	{
		if(ar[i]%2==0)
		{
			System.out.println("even Number from the array:"+ar[i]);
		}
		else
		{
			System.out.println("Odd Number from the array:"+ar[i]);
		}
	}
}
}
