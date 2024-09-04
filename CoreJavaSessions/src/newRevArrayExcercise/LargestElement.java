package newRevArrayExcercise;

public class LargestElement {

	public static void main(String[] args) {
		int arr[]= {5,10,15,20,25,30,44};
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println("Max no is: "+max);

	}

}
