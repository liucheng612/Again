package Test;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		String[] choices = { "ʯͷ", "����", "��" };

		System.out.println("������:");

		System.out.println("1 ʯͷ");

		System.out.println("2 ����");

		System.out.println("3 ��");

		Scanner scanner = new Scanner(System.in);

		int choice = scanner.nextInt();

		System.out.println("��Ĳ��ԣ�");

		System.out.println(choices[choice - 1]);

		int random = 1 + (int) Math.random() * 3;

		System.out.println("���ԵĲ��ԣ�");

		System.out.println(choices[random - 1]);

		System.out.println("ʤ���ж���");

		int dule = choice - random;

		switch (dule) {

		case 0:

			System.out.println("ƽ");

			break;

		case -1:

			System.out.println("Ӯ");

			break;

		case 2:

			System.out.println("Ӯ");

			break;

		default:

			System.out.println("��");

			break;

		}

	}

}
