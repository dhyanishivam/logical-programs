import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first string");
		String a=sc.nextLine();
		System.out.println("Enter second string");
		String b=sc.nextLine();
		boolean s;
		String str1 = a.replaceAll("\\s", "");
		String str2 = b.replaceAll("\\s", "");
		if(str1.length() != str2.length())
		{
			s=false;
		}
		else
		{
			char[] s1=str1.toLowerCase().toCharArray();
			char[] s2=str2.toLowerCase().toCharArray();
			Arrays.sort(s1);
			Arrays.sort(s2);
			s=Arrays.equals(s1, s2);
		}
		
		if(s)
		{
			System.out.println("Are anagram");
		}
		else
		{
			System.out.println("Not Anagram");
		}
		

	}

}
