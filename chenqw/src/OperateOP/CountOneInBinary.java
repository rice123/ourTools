package OperateOP;

import java.util.Scanner;

public class CountOneInBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		s.close();
		int count=0;
		while(num!=0)
		{
			count++;
			num=(num-1)&num;
		}
		System.out.print(count);
	}

}
