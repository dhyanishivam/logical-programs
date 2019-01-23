import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no");
		int n=sc.nextInt();
		while(true)
		{
			if((n%2)!=0)
			{
				System.out.println("false");
				break;
			}
			n=n/2;
			if(n==1)
			{
				System.out.println("true");
				break;
			}
		}

	}

}
