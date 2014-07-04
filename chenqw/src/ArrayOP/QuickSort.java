package ArrayOP;

public class QuickSort {
	public static void main(String[] args) {
		int[] arr={4,5,1,6,7,3,9,0};
		if(arr.length==1)
			System.out.println(arr[0]);
		else
		{
		QuickSort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void QuickSort(int [] arr,int begin,int end)
	{
		int temp;
		int i=begin;
		int j=end;
		int key=arr[begin];
		while(i!=j)
		{
			if(key==arr[i])
			{
			if(arr[j]<key)
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}	
			else
				j--;
			}
			else
			{
				if(arr[i]>key)
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}	
				else
					i++;
			}
		}
		for(int k=0;k<arr.length;k++)
			System.out.print(arr[k]+" ");
			System.out.println();
		if(begin!=i)
			QuickSort(arr,begin,i);
		if(i+1<end)
			QuickSort(arr,i+1,end);
		}
	}

