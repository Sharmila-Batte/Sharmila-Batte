
public class Pyramid1 {

	public static void main(String[] args) {
		for(int i=0;i<=5;i++)
		{
			//for(int j=i;j<=5;j++)
			for(int j=1;j<=5-i;j++)
			{
				System.out.print("*");
				System.out.print("\t");
			}
			System.out.println(" ");
		}

	}



	}
/*
 o/p:
 * * * * *
 * * * *
 * * *
 * *
 *
 */

