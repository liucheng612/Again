package test;
//���������������մ�С��������

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����������x:");
		int x = sc.nextInt();
		System.out.println("����������y");
		int y = sc.nextInt();
		System.out.println("����������z");
		int z = sc.nextInt();

		int a = 0;
		int b = 0;
		int c = 0;
		if (x < y && x < z) {
			a = x;
			if (y < z) {
				b = y;
				c = z;
			} else {
				b = z;
				c = y;
			}
		} else if (x < y && x > z) {
			a = z;
			b = x;
			c = y;
		} else if (x > y && x < z) {
			a = y;
			b = x;
			c = z;
		} else {
			if (y > z) {
				a = z;
				b = y;
				c = x;
			} else
				a = y;
			b = z;
			c = x;
		}
		System.out.println(a + " " + b + " " + c);
	}
}

// ��
//
// System.out.println("����������x:");
//
// int x = input.nextInt();System.out.println("����������y");
// int y = input.nextInt();System.out.println("����������z");
// int z = input.nextInt();
//
// int temp = 0;if(x>y)
// {
// temp = x;
// x = y;
// y = temp;
// }if(x>z)
// {
// temp = x;
// x = z;
// z = temp;
// }if(y>z)
// {
// temp = y;
// y = z;
// z = temp;
// }
//
// System.out.println(x+"<"+y+"<"+z);
// }}
