package Algorithms.tree;

import java.util.TreeMap;

public class LeetcodeHandOfStraights {

	public static void main(String[] args) {
		int input[] = {11,12,13,14,15,16,17,18,19};
		int W=3;
		System.out.println(isNStraightHand(input,W));
	}
	
	public static boolean isNStraightHand(int []hand,int w) {
		TreeMap<Integer,Integer> card_counts = new TreeMap(); 
		for(int card:hand) {
			if(!card_counts.containsKey(card)) {
				card_counts.put(card, 1);
			}else {
				card_counts.replace(card, card_counts.get(card)+1);
			}
		}
		while(card_counts.size()>0) {
			int first_card = card_counts.firstKey();
			for(int i=first_card;i<first_card+w;i++) {
				if(!card_counts.containsKey(i))return false;
				int count=card_counts.get(i);
				if(count==1) {
					card_counts.remove(i);
				}else {
					card_counts.replace(i, card_counts.get(i)-1);
				}
			}
			
		}
		return true;
	}
}
