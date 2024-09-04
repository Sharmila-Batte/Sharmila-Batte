package newRevLoops;

public class ReverseNo {

	public static void main(String[] args) {
		int rem;
		int no=1235;
		int rev=0;
		for(;no!=0;)
		{
			rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		System.out.println(rev);

	}

}
