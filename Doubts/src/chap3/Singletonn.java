package chap3;

public class Singletonn {
	private Singletonn(){
		if(Singletonn.Singletonn!=null){
			throw new InstantiationError();
		}
	}
}
