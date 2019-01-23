import java.util.Scanner;

public class SecondSmallest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of numbers");
		int n=sc.nextInt();
		System.out.println("enter the nos");
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		int min=0;
		for(int i=0; i<n; i++)
		{
			if(arr[min]>arr[i])
			{
				min=i;
			}
		}
		arr[min]=999999;
		min=0;
		for(int i=0; i<n; i++)
		{
			if(arr[min]>arr[i])
			{
				min=i;
			}
		}
		System.out.println(min);

	}

}
