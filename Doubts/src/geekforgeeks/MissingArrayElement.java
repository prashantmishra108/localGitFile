package geekforgeeks;
public class MissingArrayElement {
	public static void main(String[] args) {
	int added=0, max=11,size=10,i,a[]={1,2,3,4,5,6,7,8,9,11};	
	for(int j:a){
		added = added+j;
	}
	System.out.println(((max*(max+1))/2));
	System.out.println(add(max));
}

	private static int add(int max) {
		if(max>0)
		return add(max-1)+max;
		else 
			return 0;
	}
}
