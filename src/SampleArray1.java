import java.util.Scanner;
public class SampleArray1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String arr[]=new String[5];
		for(int i=0;i<5;i++)
		{
		System.out.println("Enter the name of the employee no:"+(i+1));
		arr[i]=sc.next();
		}
		for(int i=0;i<5;i++)
		{
		System.out.println("The name of Employee no:"+(i+1)+" is "+arr[i]);
		}


	}

}
