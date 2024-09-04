
public class Pyramid10 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{ int k=1;
			for(int j=i;j<=5;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(k+"\t");
				k++;
			}
			for(int j=1;j<=i;j++)
			{ 
				System.out.print(k+"\t");
				k++;
				
			}
			System.out.println(" ");
		}
	}

}
