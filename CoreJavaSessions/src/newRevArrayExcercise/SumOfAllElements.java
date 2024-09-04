package newRevArrayExcercise;

public class SumOfAllElements {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
			sum=sum+arr[i];
		}
		System.out.println("");
		System.out.println("Sum of all elements are: "+sum);

	}

}
