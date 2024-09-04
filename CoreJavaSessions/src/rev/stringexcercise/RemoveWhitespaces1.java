package rev.stringexcercise;

public class RemoveWhitespaces1 {

	public static void main(String[] args) {
		String str="  Auto matio n T  esting       ";
		String str2="";
		for(int i=0;i<str.length();i++)
		{
			if((str.charAt(i)!=' ') && (str.charAt(i)!='\t'))
			{
				str2=str2+str.charAt(i);
			}
		}
		System.out.println(str2);

	}

}
//https://www.youtube.com/watch?v=H9yx5x8lDB8&t=329s