package HackerEarth;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TestCls {
	
	/* IMPORTANT: Multiple classes and nested static classes are supported */

	/*
	 * uncomment this if you want to read input.
	//imports for BufferedReader
	import java.io.BufferedReader;
	import java.io.InputStreamReader;

	//import for Scanner and other utility classes
	import java.util.*;
	*/

	// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

	    public static void main(String args[] ) throws Exception {
	        /* Sample code to perform I/O:
	         * Use either of these methods for input

	        //BufferedReader
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String name = br.readLine();                // Reading input from STDIN
	        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

	        //Scanner
	        Scanner s = new Scanner(System.in);
	        String name = s.nextLine();                 // Reading input from STDIN
	        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

	        */

	        // Write your code here
	        int N ;
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        N = Integer.valueOf(br.readLine());
	        //Scanner s = new Scanner(System.in);
	        //System.out.println(N);
	        int a[]=new int[N];

	for (int i=0;i<N;i++) {
		  Scanner s = new Scanner(System.in);
		a[i]=Integer.valueOf(s.nextLine());
	}
	for(int i=0;i<N;i++){
	    for(int j=1;j<=a[i];j++){
	     if (j%5==0 && j%3==0) { System.out.println("FizzBuzz");}
	     else if ( j%3==0) { System.out.println("Bizz");}
	     else if( j%5==0) {System.out.println("Fizz");}    
	     else {System.out.println(j);}
	    }
	} 
	 
	    }
	}
