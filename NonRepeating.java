import java.util.Scanner;

public class NonRepeating {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.nextLine();
		char[] arr=s.toLowerCase().toCharArray();
		int l=s.length();
		int count=0;
		for(int i=0; i<l; i++)
		{
			count=0;
			for(int j=0; j<l; j++)
			{
				if(i!=j && arr[i]==arr[j])
				{
					count++;
					break;
				}
			}
			if(count==0)
			{
				System.out.println(arr[i]);
				break;
			}
		}
	}

}
