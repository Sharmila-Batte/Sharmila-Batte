package newRevLoops;

public class CountNoOfDigits {

	public static void main(String[] args) {
		int no=1235;
		int count=0;
		for(;no!=0;)
		{
			no=no/10;
			count++;
		}
		System.out.println(count);
	

	}

}
