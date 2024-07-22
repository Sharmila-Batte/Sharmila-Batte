
public class A {


	//User function Template for Java

	    
	    String pattern(int [][]a, int N){
	        // Code here
	        int m=a.length, n=a[0].length;
	        
	        for(int i=0; i<m; i++){
	            String temp="";
	            
	            for(int j=0; j<n; j++)
	                temp+=a[i][j];
	            if(isPalindrome(temp))
	                return i+ " R";
	        }
	        for(int i=0; i<n; i++){
	            String temp="";
	            
	            for(int j=0; j<m; j++)
	                temp+=a[j][i];
	            if(isPalindrome(temp))
	                return i+ " C";
	        }
	        return "-1";
	    }
	    
	    static boolean isPalindrome(String str){
	 
	        // Pointers pointing to the beginning
	        // and the end of the string
	        int i = 0, j = str.length() - 1;
	 
	        // While there are characters to compare
	        while (i < j) {
	 
	            // If there is a mismatch
	            if (str.charAt(i) != str.charAt(j))
	                return false;
	 
	            // Increment first pointer and
	            // decrement the other
	            i++;
	            j--;
	        }
	 
	        // Given string is a palindrome
	        return true;
	    }
	    
}
