import java.util.Scanner;

public class PowerOfFive {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no");
		int n=sc.nextInt();
		while(true)
		{
			if(n%5!=0)
			{
				System.out.println("false");
				break;
			}
			n=n/5;
			if(n==1)
			{
				System.out.println("true");
				break;
			}
		}

	}

}
