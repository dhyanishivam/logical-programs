import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a no.");
		int n=sc.nextInt();
		int r,sum=0,temp=n;
		while(n>0)
		{
			r=n%10;
			sum=sum+fact(r);
			n=n/10;
		}
		if(sum==temp)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}

	}

	private static int fact(int r) {
		int f=1;
		for(int i=1;i<=r; i++)
		{
			f=f*i;
		}
		return f;
	}

}
