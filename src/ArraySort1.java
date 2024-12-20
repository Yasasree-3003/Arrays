
public class ArraySort1 {
	public static void main(String[] args)
	{
		int[] arr= {7,5,8,10};
		// TODO Auto-generated method stub
		boolean issorted =true;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]>arr[i+1])
			{
				issorted=false;
				break;
			}
		}
		System.out.println(issorted);
		}

	}

