package ArrayOP;

public class Chorus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr={186,186,150,200,160,130,197,220};
		int [] arr_l=new int[arr.length];
		int [] arr_r=new int[arr.length];
		arr_l[0]=1;
		for(int i=1;i<arr.length;i++)
		{
			arr_l[i]=1;
			for(int j=i-1;j>-1;j--)
			{
				if(arr[i]>arr[j])
				{
					if(arr_l[i]<=arr_l[j])
						arr_l[i]=arr_l[j]+1;
				}
			}
			
		}
		
		arr_r[arr.length-1]=1;
		for(int i=arr.length-2;i>=0;i--)
		{
			arr_r[i]=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					if(arr_r[i]<=arr_r[j])
					{
					arr_r[i]=arr_r[j]+1;
					}
				}
			}
		}
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr_l[i]+arr_r[i]>max)
			{
				max=arr_l[i]+arr_r[i];
			}
		}
		System.out.println(arr.length-max+1);
	}

}
