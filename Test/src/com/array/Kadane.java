package com.array;
public class Kadane {
	
	static int maxSubArray(int a[], int size)
	{
		int max_so_far = a[0];
		int curr_max = a[0];
		
		for(int i=1; i<size; i++)
		{
			curr_max = Math.max(a[i],curr_max + a[i]);
			max_so_far = Math.max(max_so_far, curr_max);
			
		}
		return max_so_far;
	}
	
	public static void main(String[] args)
	{
		int a[] = {-1,-2,-3,-4};
		int n = a.length;
		int max_sum = maxSubArray(a, n);
		System.out.println("Maximum Contiguous Sum is "+ max_sum);
	}

}
