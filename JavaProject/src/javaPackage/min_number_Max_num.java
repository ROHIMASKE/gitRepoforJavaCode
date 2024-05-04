package javaPackage;

public class min_number_Max_num {
public static void main(String[] args) {
	int ar[]= {12,23,45,33,56,33,123,1,2,4};
	int min=ar[0];
	int max=ar[0];
	for(int i=0;i<ar.length-1;i++)
	{
		if(ar[i]<min)
		{
			min=ar[i];
		}
		else if(ar[i]>max)
		{
			max=ar[i];
		}
	}
	System.out.println("minimum value"+min);
	System.out.println("maximum value"+max);
}
}
