import java.util.Arrays;
import java.util.Scanner;

public class Panagram {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter string");
		String s=sc.nextLine();
		String st=s.toLowerCase();
		boolean sta;
		if(st.length()<26)
		{
			sta=false;
		}
		else if(st.contains("a") && st.contains("b") && st.contains("c") && st.contains("d") && st.contains("e") && st.contains("f") && st.contains("g") && st.contains("h") && st.contains("i") && st.contains("j") && st.contains("k") && st.contains("l") && st.contains("m") && st.contains("n") && st.contains("o") && st.contains("p") && st.contains("q") && st.contains("r") && st.contains("s") && st.contains("t") && st.contains("u") && st.contains("v") && st.contains("w") && st.contains("x") && st.contains("y") && st.contains("z"))
		{
			sta=true;
		}
		else
		{
			sta=false;
		}
		if (sta)
		{
			System.out.println("Panagram");
		}
		else
		{
			System.out.println("Not Panagram");
		}

	}

}
