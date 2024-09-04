package newRevArrayExcercise;

public class CountNoOfElements {

	public static void main(String[] args) {
		int arr[]= {10,8,9,4,6,2,1,8,7};
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
			count++;
		}
		System.out.println("");
		System.out.println("No of elements in array are: "+count);

	}

}
