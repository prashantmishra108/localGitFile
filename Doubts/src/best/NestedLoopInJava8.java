package best;

import java.util.ArrayList;
import java.util.List;
//https://www.baeldung.com/java-collection-stream-foreach
public class NestedLoopInJava8 {

	public static void main(String[] args) {
		
		List<State> states = new ArrayList<State>();
		List<City> cities = new ArrayList<City>();
		// first loop
		states.forEach(state -> { 
		    // second loop for filtered elements
		    cities.stream().filter(city -> state.containsPoint(city.getLocation()) ).forEach(city -> { 
		        System.out.printf("%30s is part of %-30s\n", city.getName(), state.getName());
		    });
		});
	}
	
	public void java7meth() {
		List<State> states = new ArrayList<State>();
		List<City> cities = new ArrayList<City>();

		for (State state : states) {
		    for (City city : cities) {
		        if (state.containsPoint(city.getLocation())) {
		            System.out.printf("%30s is part of %-30s\n",
		                    city.getName(), state.getName());
		        }
		    }
		}
	}
}
//You can omit streaming the states and simply use states.forEach
//https://stackoverflow.com/questions/30376500/replace-two-nested-for-loops-with-java-8-api

class State{
	public boolean containsPoint(int i) {
		return true;
	}
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class City{
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int getLocation() {
		return 5;
	}
}