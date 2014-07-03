package ArrayOP;

import java.util.Scanner;

public class MaximumSum {
	public static void main(String[] args) {
	 
		Scanner s=new Scanner(System.in);
		int[] arr={1,-2,3,-4,5,6,-2,7,-9,1,10,-3,6};
		int max=0;
		int tempsum=0;
		for(int i=0;i<arr.length;i++)
		{
			tempsum+=arr[i];
			if(tempsum>max)
				max=tempsum;
			if(tempsum<0)
				tempsum=0;
		}
		System.out.println(max);
	}

}
