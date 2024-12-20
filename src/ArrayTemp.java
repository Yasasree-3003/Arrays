
public class ArrayTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] arr={1,0,1,0};
    int[] temp=new int[4];
    int j=0;
    for(int i=0;i<arr.length;i++)
    {
    	if(arr[i]==1)
    	{
    		temp[j]=1;
    		j++;
    	}
    }
    for(int values:temp)
    {
    System.out.print(values+" ");
	}

	}
}