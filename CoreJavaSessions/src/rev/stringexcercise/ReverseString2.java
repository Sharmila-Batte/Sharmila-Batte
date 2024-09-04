package rev.stringexcercise;

public class ReverseString2 {

	public static void main(String[] args) {
		String str="Srushti";
		String rev="";
		char arr[]=str.toCharArray();
		for(int i=arr.length-1;i>=0;i--)
		{
			rev=rev+arr[i];
		}
		System.out.println(rev);

	}

}
//https://www.youtube.com/watch?v=1_hhywLAO5o&t=964s