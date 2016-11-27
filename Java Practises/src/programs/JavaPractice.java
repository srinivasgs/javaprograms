package programs;

public class JavaPractice {
	public static void main(String args[]){
		
		int[] arr = {4,6,7,7,7,9,9};
		int count=0;
		int min = 0;
		for(int i=0;i< arr.length;i++){
			if(arr[i] == 7){
				if(min == 0 || min > i)
					min = i;
				count++;
			}
		}
		
		
		
		System.out.println(min+" and "+ (min+count-1));
		
		int arr1[] = {4, 4, 7, 8, 8, 8, 9, 16, 23, 8, 42};
		 
	    int result = getLastOccurrence(arr1, 11, 8);
	 
	    System.out.println("The last occurrence is at = "+result);
	}
	
	public static int binarySearchLastOccurrence(int arr[], int low, int high, int data)
	{
	    int mid =0;
	 
	    // A simple implementation of Binary Search
	    if(high >= low)
	    {
	    	System.out.println("low :: "+ low);
	    	System.out.println("high :: "+ high);
	        mid = low + (high - low)/2; // To avoid overflow
	        System.out.println("mid :: "+ mid);
	        if((mid == high && arr[mid] == data) || (arr[mid] == data && arr[mid+1] > data))
	            return mid;
	 
	        // We need to give preference to right part of the array
	        // since we are concerned with the last occurrence
	        else if(arr[mid] <= data)
	            return binarySearchLastOccurrence(arr, mid+1, high, data);
	        else
	            // We need to search in the left half
	            return binarySearchLastOccurrence(arr, low, mid-1, data);
	    }
		return mid;
	}
	 
	public static int getLastOccurrence(int[] arr1, int len, int data)
	{
	    int low = 0;
	    int high = len - 1;
	 
	    int index = binarySearchLastOccurrence(arr1, low, high, data);
	 
	    return index;
	}
}
