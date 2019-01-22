
public class StartingS {

	public static void main(String[] args) {
		String[] input= {"apple","sample","search","cat"};
		for(int i=0; i<input.length; i++)
		{
			if(input[i]!=null)
			{
				char[] a=input[i].toCharArray();
				if( a[0]=='s' || a[0]=='S')
				{
					System.out.println(input[i]);
				}
			}
		}
	}

}
