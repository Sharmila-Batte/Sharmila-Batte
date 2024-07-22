
public class PascalsTriangle {

	public static void main(String[] args) {
		int number=1;
           for(int i=0;i<=5;i++)
	       {
	
        	   for(int j=i;j<=5;j++)
        	   {
        	     System.out.print(" ");	
        	   }
        	   number=1;
        	   for(int j=0;j<=i;j++)
        	   {
        		   System.out.print(number+" ");
        		   number=number*(i-j)/(j+1);        	   	
        	   }
        	   System.out.println();
           }

	}

}
