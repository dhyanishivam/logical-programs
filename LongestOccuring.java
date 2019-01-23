import java.util.Scanner;

public class LongestOccuring {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter string");
		String s=sc.nextLine();
		int l=s.length();
		char[] st=s.toLowerCase().toCharArray();
		int[] arr = new int[26];
		
		for(int i=0; i<26; i++)
		{
			arr[i]=0;
		}
		for(int i=0; i<l; i++)
		{
			int d=((int)st[i])-97;
			arr[d]++;
		}
		int max=arr[0],j=0;
		for(int i=0; i<26; i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
				j=i;
			}
		}
		int index=0;
		
		char alpha=(char)(j+97);
		for(int i=0; i<l; i++)
		{
			if(st[i]==alpha)
			{
				index=i;
				break;
			}
		}
		System.out.println("Longest occuring character is "+alpha+" and length is "+max+" at "+index);
	}

}
