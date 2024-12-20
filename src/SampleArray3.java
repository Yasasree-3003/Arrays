import java.util.Scanner;
public class SampleArray3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String arr[][][]=new String[3][2][2];
		for(int i=0;i<3;i++)
		{
		System.out.println("Enter the organisation no:"+(i+1));
		for(int j=0;j<2;j++)
		{
		System.out.println("Company no:"+(j+1));
		for(int k=0;k<2;k++)
		{
		System.out.println("Name of Employee:"+(k+1));
		arr[i][j][k]=sc.next();
		}
		}
		}
		for(int i=0;i<3;i++)
		{
		for(int j=0;j<2;j++)
		{
		for(int k=0;k<2;k++)
		{
		System.out.println("In the organization no :"+(i+1)+" from company no: "+(j+1)+" The name of the employee no:"+(k+1)+" is:"+arr[i][j][k]);
		}
		}
		}

	}

}
