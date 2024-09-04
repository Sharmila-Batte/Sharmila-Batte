package newRevLoops;

public class ASCIIValue {

	public static void main(String[] args) {
		char c='A';
		int asc=c;
		System.out.println(c+":"+asc);
		
		for(char ch='A';ch<='Z';ch++)
		{
			int val=ch;
			System.out.println(ch+" : "+val);
		}
		

	}

}
