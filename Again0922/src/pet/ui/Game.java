package pet.ui;

import pet.biz.Dog;

public class Game {
	public static void main(String[] args) {
		Dog d1 = new Dog("»ÆÉ«", 80, "Íú²Æ", 2);
		Dog d2 = new Dog("ºÚÉ«", 80, "»¶»¶", 1);

		d1.swim();
		System.out.println(d1.name + "---" + d1.color);
		d2.playdisc();
		System.out.println(d2.name + "---" + d2.color);

	}
}
