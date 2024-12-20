import java.util.Scanner;
public class SampleArray2d {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String arr[][]=new String[2][5];
		for(int i=0;i<2;i++)
		{
		System.out.println("Company no:"+(i+1));
		for(int j=0;j<5;j++)
		{
		System.out.println("Name of Employee:"+(j+1));
		arr[i][j]=sc.next();
		}
		}
		for(int i=0;i<2;i++)
		{
		for(int j=0;j<5;j++)
		{
		System.out.println("In company no : "+(i+1)+" Name of the Employee "+(j+1)+" is : "+arr[i][j]);
		}
		}
	}

}
