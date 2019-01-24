
public class ShortestArray {

	public static void main(String[] args) {
		int[][] arr= {{1,2,3,4},
						{0,2,7},
						{4,12},
						{1,2,5,6}};
		int l=arr.length;
		int min=0;
		for(int i=0; i<l; i++)
		{
			if(arr[min].length>arr[i].length)
			{
				min=i;
			}
			
		}
		for(int i=0; i<arr[min].length; i++)
		{
			System.out.print(arr[min][i]+" ");
		}

	}

}
