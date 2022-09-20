package chap5;

import java.util.Comparator;

public class ShellSort   {
 public static void main(String[] args) {
	 int[] inputArr = {40,30,20,10};
	// int[] inputArr = {45,23,11,89,77,98,4,28,65,43};
	 new ShellSort().shellsort(inputArr);
	  printit(inputArr);
}

 void  shellsort( int[] inputArr )
  {
  int j;
  for( int gap = inputArr.length / 2; gap > 0; gap /= 2 ){
	printit(inputArr);
  	System.out.println("gap = "+gap);
		  for( int i = gap; i < inputArr.length; i++ )
		  {
		  Integer tmp = inputArr[ i ] ;//Integer tmp2=inputArr[ j - gap ];
		  for( j = i;  j >= gap &&	 tmp.compareTo( inputArr[ j - gap ] ) < 0;   j -= gap ) {
			  System.out.println("inputArr[j] = "+inputArr[j]+" inputArr[j-gap] = "+inputArr[j-gap]);
			  inputArr[ j ] = inputArr[ j - gap ];
		  }
		  inputArr[ j ] = tmp;
		  }
  }
}
 public static void printit(int []inputArr){
	 for(int i:inputArr){
	     System.out.print(" "+ i);
	     System.out.print(" ");
		 }System.out.println();
	}
 }