package walmart;

public class NumberInsideNumber {

	public static void main(String[] args) {
		int a=234159876,b=34;
		int alength = findSizeOfB(a);
		int blength = findSizeOfB(b);
		int acounter=alength;
		int lastPart=0,unit=0,previousLastPart=0;
		while(a>0) {
			int remainder = (int) (a%Math.pow(10, blength));
			System.out.print(remainder+"   ");
			previousLastPart = lastPart;
			lastPart = (int) (a%10*Math.pow(10, unit++) + lastPart);
			
			System.out.println(previousLastPart);
			a=a/10;
		}
	}

	
	private static int findSizeOfB(int b) {
		return String.valueOf(b).length();
	}


	public int checkForNumber(int originalNum) {
	
		return 0;
	}
	public void func() {
		int a=234159876,b=34,placeholder=0,currentLastpart=0,lastpart=0;
		double newNum=0;
		while(a>0) {
			newNum=(a%100*Math.pow(100, placeholder++)) + newNum;
			lastpart = currentLastpart;
			currentLastpart = (int) newNum;
			a=a/100;
			System.out.println(newNum+"   "+lastpart);
		}
    }
}