package Excercise1LoopingIfElse;

public class Vowel {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		for(char ch='A';ch<='Z';ch++)
		{
		if(ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U') 
		{
             System.out.println("Char is vowel:"+ch);
	
		}
		else
		{
			System.out.println("Char is constant:"+ch);
		}
		}

}
}