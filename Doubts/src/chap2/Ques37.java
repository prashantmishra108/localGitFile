package chap2;

public class Ques37 {
public void arr(){
	int y[]={5,7,8,6,7,4};
	for(int n=2;n<y.length;n++){
		System.out.println(" n = "+n+"   " + "y.length = "+y.length);
		if(n<y[3]){
			continue;
		}
		System.out.println(y[n]);
	}
}
public static void main(String[] args) {
	Ques37 obj = new Ques37();//obj=null;give NPException
	obj.arr();
}
}
