package test;
// 1234 四个数，最多能组成多少个三位数 ，分别是多少。
public class Test1 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4 };
		int b = 0;

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 4; k++) {
					if (i == j || i == k || j == k) {
					} else {
						System.out.print(a[i] * 100 + a[j] * 10 + a[k]);
						b++;
						System.out.println();
					}
				}
			}
		}
		System.out.print(b);
	}
}
// int a = 0;
// int b = 0;
// int c = 0;
// int num = 1;
// for (a = 1; a < 5; a++) {
// for (b = 1; b < 5; b++) {
// for (c = 1; c < 5; c++) {
// if (a != b && a != c && b != c) {
// System.out.println("NO." + num + ":" + a + "" + b + ""
// + c);
// num++;
// }
// }
// }
// }
