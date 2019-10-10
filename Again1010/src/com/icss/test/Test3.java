package com.icss.test;

public class Test3 {
	private int x;
	private int y;

	public void setX(int x) {
		this.x = x;
	}

	public int getX() {
		return x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getY() {
		return y;
	}

	public static void main(String[] args) {
		Test3 a = new Test3();
		a.setX(10);
		a.setY(10);
		Test3 b = new Test3();
		double c;
		c = (a.getX() - b.getX()) * (a.getX() - b.getX()) + (a.getY() - b.getY()) * (a.getY() - b.getY());
		double result = Math.sqrt(c);
		System.out.println(result);
	}
}
