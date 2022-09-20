package design.factoryPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateScore {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Enter the name of player for which the score will be generated:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String player = br.readLine();
		GetPlayerFactory gpf = new GetPlayerFactory();
		StrikeRate srt = gpf.getStrikeRate(player);srt.getRate();
		System.out.println(srt.runs(5));
	}
}
