import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter string");
		String s=sc.nextLine();
		int l=s.length();
		int[] space =new int[1000];
		for(int k=0;k<space.length; k++)
		{
			space[k]=0;
		}
		char[] st=s.toCharArray();
		for (int i=0; i<l; i++)
		{
			if(st[i]==' ')
			{
				space[i]=1;
			}
		}
		String str1 = s.replaceAll("\\s", "");
		String rev=new StringBuilder(str1).reverse().toString();
		char[] rev1=rev.toCharArray();
		for(int i=0; i<l; i++)
		{
			if(space[i]==1)
			{
				System.out.print(" ");
			}
			System.out.print(rev1[i]);
		}

	}

}
