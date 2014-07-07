package StringOp;

import java.util.HashMap;

public class CountNameValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="lisi";
		String s2="zhangsan";
		countNameValue(s1);
		countNameValue(s2);
	}
	
	public static void countNameValue(String s)
	{
		int sum=0;
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++)
		{
			if(hm.containsKey(s.charAt(i)))
			{
				hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
			}
			else
			{
				hm.put(s.charAt(i),1);
			}
		}
		Object [] value=hm.values().toArray();
		for(int i=0;i<value.length;i++)
		{
			for(int j=i;j<value.length;j++)
			{
			if(Integer.parseInt(value[i].toString())<Integer.parseInt(value[j].toString()))
			{
				Object temp=value[i];
				value[i]=value[j];
				value[j]=temp;
			}
			}
		}
		for(int i=0;i<value.length;i++)
		{
			sum+=(26-i)*Integer.parseInt(value[i].toString());
		}
		System.out.println(sum);
		hm.clear();
	}

}
