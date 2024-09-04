package newRevArrayExcercise;

public class copyArrayUsingClone {

	public static void main(String[] args) {
		int arr1[]= {4,5,6,7};
		System.out.println("arr2 Elements are: ");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+" ");
		}
		System.out.println("");
		
		int arr2[]=arr1.clone();
		System.out.println("arr2 Elements are: ");
		for(int arr:arr2)
		{
			System.out.print(arr+" ");
		}
		System.out.println("");

	}

}
