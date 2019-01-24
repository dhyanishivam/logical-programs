import java.util.Scanner;

public class Occurence {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.nextLine();
		int l=s.length();
		char[] arr=s.toLowerCase().toCharArray();
		int[] count=new int[26];
		for(int i=0; i<26; i++)
		{
			count[i]=0;
		}
		for(int i=0;i<l; i++)
		{
			int x=(int)arr[i]-97;
			count[x]++;
		}
		char alpha;
		for(int i=0; i<26; i++)
		{
			if(count[i]!=0)
			{
				alpha=(char)(i+97);
				System.out.println(alpha+"="+count[i]);
			}
		}
	}

}
