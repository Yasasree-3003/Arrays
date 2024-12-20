
public class ArraySort {

	public static void main(String[] args) {
		int[] arr= {40,30,20,10};
		// TODO Auto-generated method stub
		boolean issorted =true;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]<arr[i+1])
			{
				issorted=false;
			
			}
			else
			{
				issorted=true;
			}
		}
		if(issorted==true)
		{
			System.out.println("Sorted");
		}
		else
		{
			System.out.println("Not sorted");
		}
		}
	}


