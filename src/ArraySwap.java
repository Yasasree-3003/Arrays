
public class ArraySwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {70,20,5,10};
		int start=0;
		int end=arr.length-1;
		while(start<end)
		{
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
			
		}
		for(int values:arr)
		{
			System.out.println(values);
		}

	}

}
