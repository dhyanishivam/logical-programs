import java.util.Arrays;
import java.util.Scanner;

public class Median {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of first array");
		int a=sc.nextInt();
		System.out.println("enter the first array");
		int[] first=new int[a];
		for(int i=0; i<a; i++)
		{
			first[i]=sc.nextInt();
		}
		System.out.println("enter size of second array");
		int b=sc.nextInt();
		System.out.println("enter the second array");
		int[] second=new int[b];
		for(int i=0; i<b; i++)
		{
			second[i]=sc.nextInt();
		}
		int l=a+b,c=0;
		int[] result=new int[l];
		for(int i=0; i<a; i++)
		{
			result[i]=first[i];
			c++;
		}
		for(int i=0; i<b; i++)
		{
			result[c++]=second[i];
		}
		Arrays.sort(result);
		int index=l/2;
		System.out.println(index);
				
		

	}

}
