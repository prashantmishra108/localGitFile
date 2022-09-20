package Oracke;
public class stringinstring {
public static void main(String[] args) {
	String lists = "me";
	String find = "me";
	char ls [] = lists.toCharArray();
	char fn [] = find.toCharArray();
	int got=0;
	int j =0;
	char n ;
	for(char lsindex:ls){
		int l=find.length();
		n=lsindex;
		if(j>=l){
			break;
		}
		do{ 
			char m = find.charAt(j);
			if(n == m)
			{	
				l--;
				i++;
				j++;
				if(j==2){
					got++;
					}
				if(j<l+1){
				n = lists.charAt(j);
				}
			}else
			{
				break;
			}
		}while(l>0);
		j++;
	}
	if(got>0){
	System.out.println(true+""+got);
	}
}
}
