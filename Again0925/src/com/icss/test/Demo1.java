package com.icss.test;

public class Demo1 {
	public static void main(String[] args) {
		int X[][] = new int[9][9];// Ò»Î¬Êý×é
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (i >= j) {

					int m = i + 1;
					int n = j + 1;
					X[i][j] = m * n;
					System.out.print(m + "*" + n + "=" + X[i][j] + "  ");

				}
			}
			System.out.println();

		}

	}

}
