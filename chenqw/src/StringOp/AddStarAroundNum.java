package StringOp;

import java.util.Scanner;

public class AddStarAroundNum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
        StringBuilder sb=new StringBuilder(s.nextLine());
        s.close();
      if(sb.length()==0)
        {
        	System.out.print("ÇëÊäÈë×Ö·û´®");
        	return;
        }
        int len=sb.length()-1;
        if(sb.charAt(len)>='0'&&sb.charAt(len)<='9')
        {
        	sb.insert(len+1, '*');
        }
        boolean isnum1=false;
        boolean isnum2=false;
        while(len>=0)
        {
        	isnum1=false;
        	isnum2=false;
        	if(len==0)
        	{
        		if(sb.charAt(0)>='0'&&sb.charAt(0)<='9')
        			sb.insert(0, '*');
        		break;
        	}
        	if(sb.charAt(len)>='0'&&sb.charAt(len)<='9')
        		isnum1=true; 
        	if(sb.charAt(len-1)>='0'&&sb.charAt(len-1)<='9')
        		isnum2=true;
        	if(isnum1!=isnum2)
        		sb.insert(len, '*');
        	len--;
        }
        System.out.print(sb);
	}

}
