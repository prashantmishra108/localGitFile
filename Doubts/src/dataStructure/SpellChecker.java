package dataStructure;

import java.util.*;
import java.io.*;
import java.net.*;

public class SpellChecker
{
	public static void main(String[] args) throws IOException
	{
		URL url = new URL("http://andrew.cmu.edu/course/15-121/dictionary.txt");
		Scanner sc = new Scanner( url.openStream() );

		HashSet<String> dict =  new HashSet<String>();

		while( sc.hasNext() ) dict.add(sc.next());
		sc.close();

		sc = new Scanner( new File("SpellChecker.java") );
		while( sc.hasNextLine() )
		{
			String[] tokens = sc.nextLine().split("\\W");
			for(String token : tokens)
			   if (token.length() > 1 && !dict.contains(token.toLowerCase()))
			      System.out.println(token);
		}
	}
}