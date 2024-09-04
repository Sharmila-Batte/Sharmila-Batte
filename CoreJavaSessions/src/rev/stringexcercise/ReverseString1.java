package rev.stringexcercise;

public class ReverseString1 {

	public static void main(String[] args) {
		String str="Srushti";
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);

	}

}
//https://www.youtube.com/watch?v=1_hhywLAO5o&t=964s