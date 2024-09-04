package newRevArrayExcercise;

public class SmallestElement {

	public static void main(String[] args) {
		int arr[]= {2,3,4,6,8,24,78,0,1};
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		System.out.println("Smallest no is: "+min);

	}

}
