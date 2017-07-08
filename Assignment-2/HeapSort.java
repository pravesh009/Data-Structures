import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



public class HeapSort
{
	public static void sort(int arr[])
	{
		int n = arr.length;

		// Build heap (rearrange array)
		for (int i = n / 2 - 1; i >= 0; i--)
			heapify(arr, n, i);

	}
 static int c=0;
 public static ArrayList<Integer> list1 = new ArrayList<Integer>();
 public static ArrayList<Integer> list2 = new ArrayList<Integer>();

	
	public static void heapify(int arr[], int n, int i)
	{
		int x = i; 
		int l = 2*i + 1; 
		int r = 2*i + 2;

		if (l < n && arr[l] < arr[x])
			x = l;

		if (r < n && arr[r] < arr[x])
			x = r;

		if (x != i)
		{
			int swap = arr[i];
			arr[i] = arr[x];
			arr[x] = swap;
			c++;
			list1.add(i);
			list2.add(x);
			//System.out.println(i+" "+x);
			heapify(arr, n, x);
		}
	}

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
			
			sort(arr);
			System.out.println(c);
			Iterator<Integer> it=list1.listIterator();
			Iterator<Integer> it2=list2.listIterator();
			while(it.hasNext()&&it2.hasNext()){
				System.out.println(it.next()+" "+it2.next());
			}
	}
}
