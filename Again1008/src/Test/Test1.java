package Test;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		String[] choices = { "石头", "剪刀", "布" };

		System.out.println("请输入:");

		System.out.println("1 石头");

		System.out.println("2 剪刀");

		System.out.println("3 布");

		Scanner scanner = new Scanner(System.in);

		int choice = scanner.nextInt();

		System.out.println("你的策略：");

		System.out.println(choices[choice - 1]);

		int random = 1 + (int) Math.random() * 3;

		System.out.println("电脑的策略：");

		System.out.println(choices[random - 1]);

		System.out.println("胜负判定：");

		int dule = choice - random;

		switch (dule) {

		case 0:

			System.out.println("平");

			break;

		case -1:

			System.out.println("赢");

			break;

		case 2:

			System.out.println("赢");

			break;

		default:

			System.out.println("负");

			break;

		}

	}

}
