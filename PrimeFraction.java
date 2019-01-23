import java.util.Scanner;

public class PrimeFraction {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no.");
		int n=sc.nextInt();
		int temp=n;
		for(int i=2;i<=n/2;i++)
		{
			if(isprime(i))
			{
				while(temp%i==0)
				{
					System.out.print(i+" ");
					temp=temp/i;
				}
			}
		}
		if(temp==n)
		{
			System.out.println(n);
		}

	}

	private static boolean isprime(int i) {
		int c=0;
		for(int k=2; k<=i/2; k++)
		{
			if(i%k==0)
			{
				c++;
				break;
			}
		}
		if(c==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
