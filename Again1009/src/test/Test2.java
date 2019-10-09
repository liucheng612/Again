package test;
//输入三个数，按照从小到大排序。

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入整数x:");
		int x = sc.nextInt();
		System.out.println("请输入整数y");
		int y = sc.nextInt();
		System.out.println("请输入整数z");
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

// 答案
//
// System.out.println("请输入整数x:");
//
// int x = input.nextInt();System.out.println("请输入整数y");
// int y = input.nextInt();System.out.println("请输入整数z");
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
