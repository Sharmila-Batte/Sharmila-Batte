package newRevLoops;

public class Palindrom {

	public static void main(String[] args) {
		int no = 121;
		int rev=0,rem,temp=no;
		for(;no!=0;)
		{
			rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		if(temp==rev)
		{
			System.out.println("no is palindrom");
		}
		else
		{
			System.out.println("no is not palindrom");
		}

	}

}
