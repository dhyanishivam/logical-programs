import java.util.Scanner;

public class Perfect {

	public static void main(String[] args) {
		for(int i=1; i<=100; i++)
		{
			int n=isPerfect(i);
			if(n!=0)
			{
				System.out.println(n);
			}
			
		}

	}

	private static int isPerfect(int i) {
		int sum=0;
		for(int k=1; k<=i/2; k++)
		{
			if(i%k==0)
			{
				sum=sum+k;
			}
		}
		if(i==sum)
		{
			return i;
		}
		else
			return 0;
	}

}
