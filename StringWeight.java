import java.util.Scanner;

public class StringWeight {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter string");
		String s=sc.nextLine();
		int l=s.length();
		char[] st=s.toLowerCase().toCharArray();
		int sum=0;
		for(int i=0; i<l; i++)
		{
			int a=(int)st[i];
			a=a-96;
			sum=sum+a;
		}
		System.out.println(sum);
		
	}

}
