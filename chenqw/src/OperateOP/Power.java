package OperateOP;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int e=0;
		double base=2;
		double result=power(base,e);
		System.out.println(result);
	}
	
	public static double power(double base,int e)
	{
		if(base==0.0)
			return 0.0;
		if(e==0)
			return 1;
		double result;
		int abse=e;
		if(e<0)
			abse=(-e);
		result=exponent(base,abse);
		if(e<0)
			result=1.0/result;
		return result;
	}
	
	public static double exponent(double base,int e)
	{
		double result;
		if(e==0)
			return 0;
		if(e==1)
			return base;
		result=exponent(base,e>>1);
		result*=result;
		if((e&1)==1)
			result*=base;
		return result;
	}

}
