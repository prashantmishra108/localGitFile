package Algorithms.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

//https://stackoverflow.com/questions/50715362/find-maximum-score-or-the-maximum-average-score-of-candidate-scores-given-in-two
public class FindMaxScore {//{Shyam=150.0, Balram=154.5, Mira=154.0, Ram=148.66666666666666}
 public static void main(String[] args) {
	 String scores[][] = {{"Ram","155"}, 
             {"Shyam","145"},
             {"Ram","156"},
             {"Balram","159"},
             {"Balram","150"},
             {"Ram","135"},
             {"Mira","156"},
             {"Mira","152"},
             {"Shyam","155"}};
		Map<Object, Double> scoreMap = Arrays.stream(scores)
		        .collect(
		            Collectors.groupingBy(i -> i[0], 
		            Collectors.averagingInt(i -> Integer.parseInt(i[1])
		        )));
		Map<Object, Double> scoreMap2 = Arrays.stream(scores)
		        .collect(
		            Collectors.groupingBy  (i -> i[0], Collectors.averagingInt(i -> Integer.parseInt(i[1])
		        )));
	String winner = scoreMap.entrySet().stream()
	    .max(Comparator.comparingDouble(e -> e.getValue()))
	    .get().getKey().toString();
	System.out.println(winner);
	
//	Also below ways
	Map<Object,Double> collectValues = Arrays.stream(scores).collect(Collectors.groupingBy(a->a[0],Collectors.averagingInt(a->Integer.parseInt(a[1]))));

    Map.Entry<Object,Double> MaxMarks = collectValues.entrySet().stream().max((e1,e2)->Double.compare(e1.getValue(), e2.getValue())).get();

    System.out.println(MaxMarks.getKey() + " :: " + MaxMarks.getValue());
 	}
}
