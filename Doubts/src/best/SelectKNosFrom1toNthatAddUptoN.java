package best;

public class SelectKNosFrom1toNthatAddUptoN {
	static int count = 0;
	public static void main(String[] args) {
		
		sumKN(2,10,5);
		System.out.println(count);
	}
	
	static void sumKN(int k,int n, int r){
		
		if(n<0)return;
		if(n==0 && r!=0)return;
		if(k==0 && n!=0)return;
		if(n==0 && r==0){
			count++;
			return;
		}
		if(r<=0)return;
		sumKN(k+1,n,r);
		//sumKN(k+1,n-k,r-1);
		
	}
	
	
	
}
