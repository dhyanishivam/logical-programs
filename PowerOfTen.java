import java.util.Scanner;

public class PowerOfTen {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no");
		int n=sc.nextInt();
		int r;
		while(true)
		{
			r=n%10;
			
			if(r!=0)
			{
				break;
			}
			n=n/10;
		}
		if(n==1)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}

	}

}
