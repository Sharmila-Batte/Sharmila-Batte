package newRevArrayExcercise;

public class RotateArray {
	//Reverse
	public static void reverse(int arr[],int i,int j)
	{
		while(i<j)
		{
		  int temp=arr[i];
		  arr[i]=arr[j];
		  arr[j]=temp;
		  i++;
		  j--;
		}
	}
	public static void rotate(int arr[],int k)
	{
		//for left rotate +ve value
		k=k%arr.length;
		//for right array -ve value
		if(k<0)
		{
			k=k+arr.length;
		}
		reverse(arr,0,k-1);
		reverse(arr,k,arr.length-1);
		reverse(arr,0,arr.length-1);
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		System.out.println("Array before rotate: ");
		for(int a:arr)
		{
			System.out.print(a+" ");
		}
		System.out.println("");
		rotate(arr,3);
		for(int a:arr)
		{
			System.out.print(a+" ");
		}
		System.out.println("");
		
		

	}

}
//https://www.youtube.com/watch?v=oABQlhrhXzg&t=1029s