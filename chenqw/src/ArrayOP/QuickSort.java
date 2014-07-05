package ArrayOP;

public class QuickSort {
	public static void main(String[] args) {
		int[] arr={2,3,1,5,-1,6,4};
		if(arr.length==0)
		{
			System.out.println("ÇëÊäÈëÊı×é");
			return;
		}
		QuickSort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
	
	public static void QuickSort(int [] arr,int begin,int end)
	{
		if(begin==end)
			return;
		int index=Sort(arr,begin,end);
		if(begin!=index)
			QuickSort(arr,begin,index-1);
		if(index+1<end)
			QuickSort(arr,index+1,end);
	}
	
	public static int Sort(int [] arr,int begin,int end)
	{
		int temp;
		int key=arr[begin];
		while(begin!=end)
		{
			if(key==arr[begin])
			{
			if(arr[end]<key)
			{
				temp=arr[begin];
				arr[begin]=arr[end];
				arr[end]=temp;
			}	
			else
				end--;
			}
			else
			{
				if(arr[begin]>key)
				{
					temp=arr[begin];
					arr[begin]=arr[end];
					arr[end]=temp;
				}	
				else
					begin++;
			}
		}
		return begin;
		}
	}

