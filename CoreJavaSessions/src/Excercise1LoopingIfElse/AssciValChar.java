package Excercise1LoopingIfElse;

public class AssciValChar {

	public static void main(String[] args) {

		// A-Z=65-90 a-z=97-122
		char char1='A';
		char char2='B';
		
		int a=char1;
		int b=char2;
		
		System.out.println("Ascci value of"+char1+a);
		System.out.println("Ascci value of"+char2+b);
		
		for(char ch='A';ch<='Z';ch++)
		{
			int val=ch;
			System.out.println(ch+":"+val);
		}

}
}