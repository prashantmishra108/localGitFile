package chap5;

public class MyMergeSort {
    
    private int[] array;
    private int[] tempMergArr;
    private int length;
    static int index;
    static int index0;
    static int index1;
    static int index2;
    public static void main(String a[]){
         
        int[] inputArr = {1,2,3,4,5,6,7,8,9,10};
        // {45,23,11,89,77,98,4,28,65,43};{43,43,43,43,43,43,43,43,43,43};
        MyMergeSort mms = new MyMergeSort();
        mms.sort(inputArr);
        for(int i:inputArr){
          //  System.out.print(" "+ i);
            //System.out.print(" ");
        }
    }
     
    public void sort(int inputArr[]) {
        this.array = inputArr;
        this.length = inputArr.length;
        this.tempMergArr = new int[length];
        doMergeSort(0, length - 1);
    }
 
    private void doMergeSort(int lowerIndex, int higherIndex) {//45,23,11,89,77,98,4,28,65,43
         index++;System.out.print("index "+index+"  ");
         System.out.println("Lower Index = "+lowerIndex+  " HigherIndex = "+higherIndex);
        if (lowerIndex < higherIndex) {
        	index0++;System.out.print("index0 "+index0+"  ");
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // Below step sorts the left side of the array
            doMergeSort(lowerIndex, middle);//5  9  7
            index1++;System.out.print("index1 "+index1+"  ");
            // Below step sorts the right side of the array
            doMergeSort(middle + 1, higherIndex);// 0  4  2 /0  9  4
            index2++;System.out.print("index2 "+index2+"  ");            
            // Now merge both sides
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }
 
    private void mergeParts(int lowerIndex, int middle, int higherIndex) {//45,23,11,89,77,98,4,28,65,43
    	//System.out.println("\nmerge starts || lowerIndex="+lowerIndex+" || middle = "+middle+" ||higherIndex = "+higherIndex);
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = array[i];//System.out.print(" |("+i+") "+array[i]);
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
        //System.out.print(" \n Merge Ends -  ");
        for (int ii = lowerIndex; ii <= higherIndex; ii++) {
          // System.out.print(" |("+ii+") "+array[ii]);
        }
    }
}
