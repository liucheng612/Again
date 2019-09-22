package pet.biz;

public class Dog {
	public String color;
	public int health;
	public String name;
	public double age;
	private String swimtype;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public Dog(String color, int health, String name, double age) {
		super();

		this.color = color;
		this.health = 80;
		this.name = name;
		this.age = age;
		this.swimtype = "狗刨";
	}

	public void playdisc() {
		System.out.println(name + "在玩飞碟");
	}

	public void swim() {
		System.out.println(name + "在游泳，它的泳姿是---" + this.swimtype);
	}

}
