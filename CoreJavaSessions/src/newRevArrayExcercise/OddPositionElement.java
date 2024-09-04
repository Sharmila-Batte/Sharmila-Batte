package newRevArrayExcercise;

public class OddPositionElement {

	public static void main(String[] args) {
		int arr[]= {2,11,6,7,14,9};
		System.out.println("Odd position no are: ");
		for(int i=1;i<arr.length;i=i+2)
		{
			System.out.println(arr[i]);
		}

	}

}
