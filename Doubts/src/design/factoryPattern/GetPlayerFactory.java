package design.factoryPattern;

public class GetPlayerFactory {

	public StrikeRate getStrikeRate(String srt){
		
		if(srt.equals("Sachin")){return new Sachin();}
		else if(srt.equals("Kumble")){return new Kumble();}
		return null;
	}
}
