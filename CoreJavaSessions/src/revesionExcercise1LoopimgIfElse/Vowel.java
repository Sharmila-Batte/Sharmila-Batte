package revesionExcercise1LoopimgIfElse;

public class Vowel {

	public static void main(String[] args) {
		for(char ch='A';ch<='Z';ch++)
		{
			if(ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U')
			{
				System.out.println("Character is vowel: "+ch);
			}
			else
			{
				System.out.println("Character is constant: "+ch);
			}
		}

	}

}
