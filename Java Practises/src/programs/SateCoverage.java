package programs;

import java.util.Arrays;

public class SateCoverage {

	
	public static void main(String args[]){
		
		for(int i=0; i < 5 ; i++){
			
			System.out.println(Satellite.getInstance().hashCode());
		}
		int[] a = {3,4,5,7,9};
		int[] b = {2,4,5,9,10};
		System.out.println(Arrays.toString(merge(a,b)));
	}
	
	
	public static int[] merge(int[] a, int[] b) {

	    int[] answer = new int[a.length + b.length];
	    int i = 0, j = 0, k = 0;

	    while (i < a.length && j < b.length)
	    {
	        if (a[i] < b[j])       
	            answer[k++] = a[i++];

	        else        
	            answer[k++] = b[j++];               
	    }

	    while (i < a.length)  
	        answer[k++] = a[i++];


	    while (j < b.length)    
	        answer[k++] = b[j++];

	    return answer;
	}
}


