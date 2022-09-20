package design.builderPattern;
public class BuilderPattern {
	int type;
	String model;
	Phone phoneObj; 
	public BuilderPattern setType(int type) {
		this.type = type;
		return this;
	}
	public BuilderPattern setModel(String model) {
		this.model = model;
		return this;
	}
	public Phone getPhone(){
	return new Phone(type,model);
	}
}

