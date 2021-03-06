/* Java program for Merge Sort */
/*
class MergeSort 
{ 
	// Merges two subarrays of arr[]. 
	// First subarray is arr[l..m] 
	// Second subarray is arr[m+1..r] 
	void merge(int arr[], int l, int m, int r) 
	{ 
		// Find sizes of two subarrays to be merged 	 
		int n1 = m - l + 1; 
		int n2 = r - m; 

		/* Create temp arrays 
		int L[] = new int [n1]; 
		int R[] = new int [n2]; 

		for (int i=0; i<n1; i++) 
			L[i] = arr[l + i]; 
		for (int j=0; j<n2;j++) 
			R[j] = arr[m + 1+ j]; 




		int i = 0, j = 0; 

		int k = l; 
		while (i < n1 && j 
				arr[k++] = L[i++]; 
			} 
			else
			{ 
				arr[k++] = R[j++]; 
			} 
		} 

		
		while (i < n1) 
		{ 
			arr[k++] = L[i++]; 
		} 

		while (j < n2) 
		{ 
			arr[k++] = R[j++]; 
			//; 
			//k++; 
		} 
	} 
	// Main function that sorts arr[l..r] using 
	// merge() 
	void sort(int arr[], int l, int r) 
	{ 
		if (l < r) 
		{ 
			// Find the middle point 
			int m = (l+r)/2; 

			// Sort first and second halves 
			sort(arr, l, m); 
			sort(arr , m+1, r); 

			// Merge the sorted halves 
			merge(arr, l, m, r); 
		} 
	} 

	static void printArray(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i=0; i<n; ++i) 
			System.out.print(arr[i] + " "); 
		System.out.println(); 
	} 

	// Driver method 
	public static void main(String args[]) 
	{ 
		int arr[] = {12, 11, 13, 5, 6, 7}; 

		System.out.println("Given Array"); 
		printArray(arr); 

		MergeSort ob = new MergeSort(); 
		ob.sort(arr, 0, arr.length-1); 

		System.out.println("\nSorted array"); 
		printArray(arr); 
	} 
} 
/* This code is contributed by Rajat Mishra */










public class MergeSort {
	
	void sort(int[] arr, int low, int high) {
		if(low<high) {
			int mid = (low+high)/2;
			sort(arr,low,mid);
			sort(arr,mid+1,high);
			merge(arr,low,mid,high);
		}
	}

	private void merge(int[] arr, int low, int mid, int high) {
		int n1 = mid-low+1;
		int n2 = high-mid;
		int[] L = new int[n1];
		int[] R = new int[n2];
		for (int i = 0; i < n1; i++) {
			L[i]= arr[low+i];			
		}
		for(int i=0;i<n2;i++) {
			R[i]= arr[i+mid+1];
		}
		
		int j=0,i=0,k=low;
		while(i<n1 && j<n2) {
			if(L[i] <= R[j])
				arr[k++] = L[i++];
			else
				arr[k++] = R[j++];
	}
		while(i<n1) {
			arr[k++]= L[i++];
			}
		while(j<n2) {
			arr[k++] = R[j++];
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {12,11,13,5,6,7};
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		MergeSort ob = new MergeSort();
		ob.sort(arr, 0, arr.length-1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	
	
}
