package programs;

import java.util.Arrays;

public class MergeSort {
    
   public int[] array;
   private int[] tempMergArr;
   private int length;

   public static void main(String a[]){
        
       int[] inputArr = {45,23,11,89,77,98,4,28,65,43};
       
       int[] inputArr1 = {45,23,11,89,77,98,4,28,65,43,25,43,15,8};
       MergeSort mms = new MergeSort();
       mms.sort(inputArr);
       for(int i:inputArr){
           System.out.print(i);
           System.out.print(" ");
       }
//       inputArr1 = inputArr1;
       int middle = 0 + ((inputArr1.length -1) - 0) / 2;
       int lowerIndex = 0;
       int higherIndex = inputArr1.length -1;
       int[] tempMergArr= new int[higherIndex];
       System.out.println(Arrays.toString(inputArr1));
       System.out.println("lowIndex : "+ lowerIndex +" -- higherIndex : "+ higherIndex+"  middle index : "+ middle);
       for (int i = lowerIndex; i < higherIndex; i++) {
           tempMergArr[i] = inputArr1[i];
       }
       
       int i = lowerIndex;
       int j = middle + 1;
       int k = lowerIndex;
       
       while (i <= middle && j <= higherIndex) {
           if (tempMergArr[i] <= tempMergArr[j]) {
        	   inputArr1[k] = tempMergArr[i];
               i++;
           } else {
        	   inputArr1[k] = tempMergArr[j];
               j++;
           }
           k++;
       }
       while (i <= middle) {
    	   inputArr1[k] = tempMergArr[i];
           k++;
           i++;
       }
       
       for(int i1:inputArr){
           System.out.print(i1);
           System.out.print(" ");
       }
   }
    
   public void sort(int inputArr[]) {
       this.array = inputArr;
       this.length = inputArr.length;
       this.tempMergArr = new int[length];
       doMergeSort(0, length - 1);
   }

   private void doMergeSort(int lowerIndex, int higherIndex) {
        
       if (lowerIndex < higherIndex) {
           int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
           doMergeSort(lowerIndex, middle);
           doMergeSort(middle + 1, higherIndex);
           mergeParts(lowerIndex, middle, higherIndex);
       }
   }

   private void mergeParts(int lowerIndex, int middle, int higherIndex) {
	   System.out.println("lowIndex : "+ lowerIndex +" -- higherIndex : "+ higherIndex+"  middle index : "+ middle);
       for (int i = lowerIndex; i <= higherIndex; i++) {
           tempMergArr[i] = array[i];
       }
       int i = lowerIndex;
       int j = middle + 1;
       int k = lowerIndex;
       while (i <= middle && j <= higherIndex) {
           if (tempMergArr[i] <= tempMergArr[j]) {
               array[k] = tempMergArr[i];
               i++;
           } else {
               array[k] = tempMergArr[j];
               j++;
           }
           k++;
       }
       while (i <= middle) {
           array[k] = tempMergArr[i];
           k++;
           i++;
       }

   }
}


