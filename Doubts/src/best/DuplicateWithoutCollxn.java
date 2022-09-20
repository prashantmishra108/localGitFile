package best;

import java.util.Arrays;

public class DuplicateWithoutCollxn {

	public static void main(String[] args) {
		String str = "daogdonorkfromhomeZ";
		char[] sortecChar = str.toCharArray();char blank=' ';
		Arrays.sort(sortecChar);
		//String reverse = new StringBuilder(new String(str)).reverse().toString();
		System.out.println(sortecChar);
		String stored = "";
		int j = 0;
		for (int i=0;i<sortecChar.length-1;i++){
			stored = stored + String.valueOf(sortecChar[i]); 
			if(sortecChar[i]==sortecChar[i+1] ){
				stored = ++j + stored;
			}else{
				if(j!=0){
					System.out.print(sortecChar[i]+"-->");
					System.out.println(stored.indexOf(sortecChar[i])+1);//return the first occurrence
				}
				stored="";j=0;
			}
		}
	}
}
