package rev.stringexcercise;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		String str="   Auto mation T esting   ";
		String str2=str.replaceAll("\\s", "");
		System.out.println(str2);
	//	String newString=StringUtils.deleteWhitespace(str);
		//System.out.println(newString);

	}

}
//https://www.youtube.com/watch?v=-Miz0uInWVw