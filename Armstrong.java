
public class Armstrong {

	public static void main(String[] args) {
		for(int i=1; i<=1000; i++)
		{
			int n=isArmstrong(i);
			if(n!=0)
			{
				System.out.println(n);
			}
			
		}

	}

	private static int isArmstrong(int i) {
		int temp=i,c=0,r,sum=0;
		while(temp>0)
		{
			c++;
			temp=temp/10;
		}
		temp=i;
		while(temp>0)
		{
			r=temp%10;
			sum=(int) (sum+Math.pow(r, c));
			temp=temp/10;
		}
		if(sum==i)
		{
			return i;
		}
		else
		{
			return 0;
		}
	}

}
