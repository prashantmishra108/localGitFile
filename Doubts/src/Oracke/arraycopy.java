package Oracke;

public class arraycopy {

	public static void main(String[] args) {
		
		int a[] = {11,22,33,44,55,66,77,88,99};
		int b[] = {01,21,31,51,41,61,71,81,91};
		System.arraycopy(a, 2, b, 2, 3);
		int ac = 0;
		for(int no:a){
			System.out.print(no+" ");
		}
		System.out.println();
		for(int no:b){
			System.out.print(no+" ");
		}
		
	}
}
