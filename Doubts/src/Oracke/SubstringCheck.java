package Oracke;

public class SubstringCheck {
	String mainString= "abcdefghijkl"; int pos=0;
	
	
public static void main(String[] args) {
	String subtring="abcdefg";
	System.out.println("substring="+subtring);
	boolean contains ="abcdefghijkl".contains ("ghi");
	System.out.println("contains="+contains);
	CharSequence charSequence = "abcdefghijkl";
	String charString = "abcdefghijkl";
	boolean bool = new SubstringCheck().myContains(subtring);
	System.out.println(bool);
//	checkHasString("abcdefghijkl" ,subtring);
}

boolean myContains(String checkString) {
	boolean flag=false;String mainstr="",checkStr="";int checkptr=0;
	for(pos=0;pos+checkptr<=mainString.length() 
		 ;pos++ ) {
		char a = mainString.charAt(pos);
		char b=checkString.charAt(checkptr);
		if(a==b) {
			System.out.println("a="+a+" b="+b+" checkString="+checkString+"checkptr="+checkptr+""
					+ " pos="+pos);
			checkStr=checkStr+a;checkptr++;
			if(checkString.equals(checkStr)) {
				System.out.println("equal");
				flag=true;
				break;
			}
		}else {
			mainstr=checkStr="";checkptr=0;
		}
		
	}
	return flag;
}

static void checkHasString(String mainString, String checkString) {
	System.out.println("My mainString:"+ mainString +" My checkString:"+checkString);
	if(mainString.indexOf(checkString) ==-1) {
		System.out.println("Does not contains the substrig");
	}else
		System.out.println(" contains the substrig");
			
			
}
}
