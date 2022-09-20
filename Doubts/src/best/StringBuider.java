package best;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StringBuider {

	public static void main(String[] args) {

		BufferedReader input;
		String word , words = null;
		String file = "Ram.txt";
		long strttime , stoptime, duration;
		strttime = stoptime = duration = 0;
		try{
			input = new BufferedReader(new FileReader(file));
			strttime = System.nanoTime();
			while((word = input.readLine())!=null){
				words +=word+"";
			}
			stoptime = System.nanoTime();
			duration = stoptime - strttime ;
			System.out.println(duration+words);
		}	catch(IOException e){
				e.printStackTrace();
			}
		try{
			StringBuilder sbd = new StringBuilder();
			input = new BufferedReader(new FileReader(file));
			strttime = System.nanoTime();
			while((word = input.readLine())!=null){
				sbd =sbd.append(word);
			}
			stoptime = System.nanoTime();
			duration = stoptime - strttime;
			System.out.println(duration);
		}
		catch(IOException e){
			e.printStackTrace();
		}
		System.out.println("hi");
		
}
}