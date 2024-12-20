import java.util.Scanner;
public class JaggedArray2d {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of companies:");
		int m=sc.nextInt();
		String arr[][]=new String[m][];
		for(int i=0;i<m;i++)
		{
		System.out.println("Enter the number of employees in company no:"+(i+1));
		arr[i]=new String[sc.nextInt()];
		}
		//Storing 
		for(int i=0;i<arr.length;i++)
		{
		System.out.println("Inside company no:"+(i+1));
		for(int j=0;j<arr[i].length;j++)
		{
		System.out.println("Enter the name of the employee no:"+(j+1));
		arr[i][j]=sc.next();
		}
		}
		//Retriving
		for(int i=0;i<arr.length;i++)
		{
		for(int j=0;j<arr[i].length;j++)
		{
		System.out.println("The name of employee no:" +(j+1)+" from company no: "+(i+1)+" is: "+arr[i][j]);
		}
		}

	}

}
