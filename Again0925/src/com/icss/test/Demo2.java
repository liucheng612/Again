package com.icss.test;

public class Demo2 {
	public static void main(String[] args) {
		String str = "���ã���ӭ����JAVA����";
		int length = str.length();
		char[] stringArr = str.toCharArray();
		for (int i = 0; i < length; i++) {
			if ('J' == stringArr[i]) {
				System.out.println(i);
			}
		}
	}
}
