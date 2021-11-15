import java.util.*;
public class bubblesort{
	public static void main(String args[])
	{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter no.of elements");
	int n = s.nextInt();
	int[] arr = new int[n];
	System.out.println("Enter elements");
	for(int i=0;i<n;i++){
	arr[i] = s.nextInt();	
	}
	sort(arr);
	System.out.println(Arrays.toString(arr));
	
	}
        static void sort(int[] a)
	{
	int n = a.length;
	for(int i=0;i<n;i++)
		{
		for(int j=1;j<=n-i-1;j++)
			{
			if(a[j]<a[j-1])
				{
				int temp = a[j];
				a[j]=a[j-1];
				a[j-1] = temp;
				}
	
			}
		}
	}
	
	
}

















