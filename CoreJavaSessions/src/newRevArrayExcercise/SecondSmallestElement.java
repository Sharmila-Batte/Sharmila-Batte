package newRevArrayExcercise;

public class SecondSmallestElement {

	public static void main(String[] args) {
		int arr[]= {20,18,34,5,6};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		for(int a:arr)
		{
			System.out.print(a+" ");
		}
		System.out.println("");
		
		System.out.println("2nd smallest no in array is: "+arr[arr.length-2]);

	}

}
