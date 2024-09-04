package rev.stringexcercise;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {
		String str1="listen";
		String str2="silent";
		char ch1[]=str1.toCharArray();
		char ch2[]=str2.toCharArray();
		if(ch1.length!=ch2.length)
		{
			System.out.println("String is nt anagram");
			System.exit(0);
		}
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		for(int i=0;i<ch1.length;i++)
		{
		      if(ch1[i]!=ch2[i])
		      {
		    	  System.out.println("String is nt anagram");
		    	  System.exit(0);
		      }
		}
		System.out.println("String is anagram");

	}

}
