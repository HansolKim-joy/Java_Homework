package practice3.model.vo;

public class Dog extends Animal{
	public static final String PLACE = "局斑墨其";
	private int weight;
	
	public Dog() {}
	public Dog(String name, String kinds, int weight) {
		super(name, kinds);
		this.weight = weight;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public void speak() {
		System.out.println(super.toString() + " 个公霸绰 " + weight + "kg 涝聪促.");
	}

}
