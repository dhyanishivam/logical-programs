import java.util.Scanner;

public class StringDifference {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter input string");
		String input=sc.nextLine();
		String given="abcdefghijklmnopqrstuvwxyz";
		differenceOfCharacters(input,given);

	}

	private static void differenceOfCharacters(String input, String given) {
		int l=input.length();
		int flag=0;
		char[] inp=input.toLowerCase().toCharArray();
		char[] giv=given.toLowerCase().toCharArray();
		for(int i=0; i<26; i++)
		{
			flag=0;
			for(int j=0; j<l; j++)
			{
				if(giv[i]==inp[j])
				{
					flag=1;
				}
			}
			if(flag==0)
			{
				System.out.print(giv[i]+" ");
			}
		}
		
	}

}
