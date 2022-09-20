package Oracke;

public class stringinsidestring {

public static void main(String[] args) {
	
	String lists = "memearabicmeme";
	String find = "me";
	int i=0;
	char ls [] = lists.toCharArray();
	char fn [] = find.toCharArray();
	int fnl = fn.length;
	int got=0;
	int j =0;
	int index;
	for(char c:ls){
		j=0;
		char temp = c;System.out.println(j);
		while(temp == fn[j] && j<=fnl-1){
		j++;
		if(j==fnl){
			got++;
		}
		if(j<=fnl-1)
		temp=ls[j];
		else
			break;
	}
}	
	if(got>0){
	System.out.println(true+""+got);
	}
}
}
