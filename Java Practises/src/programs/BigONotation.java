package programs;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BigONotation {
	private int arraySize;
	private int[] theArray;
	private int itemInArray = 0;
	static long startTime;
	static long endTime;

	public BigONotation(int size) {
		arraySize = size;
		theArray = new int[size];

	}

	

	
	public void pLnArray(){
		System.out.println(Arrays.toString(theArray));
	}
	public void swapValues(int a, int b) {
		int temp = theArray[a];
		theArray[a] = theArray[b];
		theArray[b] = temp;
	}

	public void getRandomArry() {
		for (int i = 0; i < arraySize ; i++) {
			theArray[i] = (int) (Math.random() * 10) + 10;
			
		}
		
		itemInArray = arraySize - 1;
	}

	public void addItemtoArray(int val) {
		theArray[itemInArray++] = val;
	}

	public void linearSearch(int val) {
		Boolean valueInArray = false;
		String valueIndex = "";
		startTime = System.currentTimeMillis();
		for (int i = 0; i < arraySize; i++) {
			if (theArray[i] == val) {
				valueInArray = true;
				valueIndex += i + " ";
			}
		}

		endTime = System.currentTimeMillis();
		System.out.println("value Found " + valueIndex);
		System.out.println("Excution time : " + (endTime - startTime));
	}

	public void bubleSort() {
		startTime = System.currentTimeMillis();
		
		for (int i = arraySize-1; i >1; i--) {
			for (int j = 0; j < i; j++) {
				if(theArray[j] > theArray[j+1]){
					swapValues(j, j+1);
				}
			}
		}

		endTime = System.currentTimeMillis();
		System.out.println("Excution time : " + (endTime - startTime));
	}
	
	public void selectionSort() {
		startTime = System.currentTimeMillis();
		
		for (int i = 0; i < arraySize; i++) {
			int min = i;
			for (int j = i; j < arraySize; j++) {
				if(theArray[min] > theArray[j]){
					min = j;
				}
				
			}
			swapValues(i, min);
			
			pLnArray();
		}

		endTime = System.currentTimeMillis();
		System.out.println("Excution time : " + (endTime - startTime));
	}
	
	public void binarySearch(int val){
		int lowIndex = 0;
		int highIndex = arraySize -1;
		
		while(lowIndex <= highIndex){
			int middleindex = (highIndex + lowIndex) /2;
			if(theArray[middleindex] < val)
				lowIndex = middleindex +1;
			else if(theArray[middleindex] > val)
				highIndex = middleindex -1;
			else{
				System.out.println(" we found value = "+val+" at postion "+ middleindex);
				lowIndex = highIndex +1;
			}
			
//			System.out.println(" we found value = "+val+" at postion "+ middleindex);
		}
	}
	
	public static void main(String args[]) {

		BigONotation testo1 = new BigONotation(10);
		testo1.getRandomArry();

//		BigONotation testo2 = new BigONotation(200000);
//		testo2.getRandomArry();
//
//		BigONotation testo3 = new BigONotation(300000);
//		testo3.getRandomArry();

//		testo1.linearSearch(20);
//		testo2.linearSearch(20);
//		testo3.linearSearch(20);
		
		
		testo1.pLnArray();
		
//		testo1.bubleSort();
		testo1.selectionSort();
		testo1.pLnArray();
		
//		testo1.binarySearch(10);

	}
}
