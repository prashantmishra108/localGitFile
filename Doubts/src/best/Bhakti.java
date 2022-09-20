package best;

import java.util.Arrays;

import com.sun.tools.javac.util.ArrayUtils;

public class Bhakti {
	//int x;
	static int x;
	public static void main(String[] args) {
		   int arr1[] = { 0, 1, 2, 3, 4, 5 };
		   int arr2[] = { 0, 10, 20, 30, 40, 50 };
		   // copies an array from the specified source array
		   System.arraycopy(arr1, 0, arr2, 0, 5);
	Arrays.stream(arr2).forEach(e->System.out.print(e+" "));
		   System.out.println("array2 ");
		//Arrays.asList(arr2).stream().forEach(System.out::println );//does not work for int arrays
		Arrays.asList(
				new String[] { "hallo", "hi", "test", "test2", "test3", "test4", "test5", "test6", "test7", "test8" })
				.forEach(System.out::print);
		//System.out.println(Arrays.toString(arr2));
		// for(int a:arr2)System.out.println(a);
		   String s1 = "Hello", s2 = s1 ,
		   s3 = new String("Hello") , s4 = "lo" ;
			/*System.out.println(s1 == "Hello"); //true
			System.out.println(s1 == s2); //true
			System.out.println(s1 == s3); //false
		 *///Strings computed by concatenation at 
			//run-time are newly created and therefore distinct.
			//System.out.println("Hello" == "Hel"+s4); //flase
		 
			//s3 is not literal, so distinct
			System.out.println(" ");
		    System.out.println(s3 == ("Hel"+s4).intern()); //false
			System.out.println(s1 == ("Hel"+s4).intern()); //true
			//The result of explicitly interning a computed string is the same 
			//string as any pre-existing literal string with the same contents.
			//"Hello" is found in literal pool inside heap bt not in just pool, 
			//also called "perm- pool"
			System.out.println("ok ");
			System.out.println(s1 == s3.intern()); //true
			System.out.println("Hello" == ("Hel"+s4).intern()); //true
			System.out.println(s3 == ("Hel"+s4).intern()); //false
			System.out.println(s3.intern() == ("Hel"+s4).intern()); //true
			String y=new String("yintern1"),z="yintern1";
			System.out.println(z==y.intern());//true
	}

}