package StringOp;

import java.util.Scanner;

public class TheSameString {
	//求最大公共子串
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			String s1=s.nextLine();
			String s2=s.nextLine();
			s.close();
			if(s1.length()==0||s2.length()==0)
				System.out.println("字符串不能为空");
			else
			{
			if(s1.length()<s2.length())
				Compare(s1,s2);
			else Compare(s2,s1);
			LCSMethod(s1,s2);
			}
		}
		
		//渣渣算法，时间复杂度为三次方
		public static void Compare(String s1,String s2)
		{
			String s="";
			boolean isget=false;
			for(int i=s1.length()-1;i>=0;i--)
			{
				for(int j=0;j<s1.length()-i;j++)
				{
					s=s1.substring(j, i+j+1);
					if(s2.contains(s))
					{
						isget=true;
						System.out.println(s);
						return;
					}	
				}
			}
			if(!isget)
			{
				System.out.print("没有找到");
				return;
			}
		}
		
		
		//LCS方法，时间复杂度为n平方
		public static void LCSMethod(String s1,String s2)
		{
			int max=0;
			int max_indexi=0;
			int[][] shuzu=new int[s1.length()][s2.length()];
			for(int i=0;i<s1.length();i++)
			{
				for(int j=0;j<s2.length();j++)
				{
					if(s1.charAt(i)==s2.charAt(j))
					{
						if(i==0||j==0)
							shuzu[i][j]=1;
						else
							shuzu[i][j]=1+shuzu[i-1][j-1];
						if(shuzu[i][j]>max)
						{
							max=shuzu[i][j];
							max_indexi=i;
						}
					}
				}
			}
			if(max==0)
			{
				System.out.println(0);
			}
			else
			{
			System.out.println("公共最长子串长度为："+max);
			System.out.print("公共最长子串为：");
			for(int i=max_indexi-max+1;i<=max_indexi;i++)
			{
				System.out.print(s1.charAt(i));
			}
			}
		}

}
