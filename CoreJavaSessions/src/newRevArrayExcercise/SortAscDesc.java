package newRevArrayExcercise;

public class SortAscDesc {

	public static void main(String[] args) {
		int arr[]= {12,4,5,7,15,6,20};
		//asc order
		System.out.println("Asc Order: ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
			   if(arr[i]>arr[j])
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
		//Desc order
		System.out.println("Desc Order: ");
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
		
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		System.out.println("");

	}

}
