package Oracke;
public class Divide235 {

	public static void main(String[] args) {

		int i=0,j=6;
		boolean flag = true;
		do{	
			flag=true;
			if((j%2==0 || j%3==0 || j%5==0 ) ){	// checks if it is divisible by 2,3,or 5
				for(int a=6;a<j;a++){       	// checks if j is divisible by any element greater than 5 
					if(j%a==0)
					{
						flag=false;break;
					}
				}
					if(flag==false){
						System.out.println("j= "+j+" i= "+i);
					i++;
					}
				}j++;
		}while(i<9);
		System.out.println("i="+i);
	}
}
