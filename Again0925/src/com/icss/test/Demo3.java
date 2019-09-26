package com.icss.test;

public class Demo3 {
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
		Demo3 a = new Demo3();
		a.setX(10);
		a.setY(10);
		Demo3 b = new Demo3();
		double c;
		c = (a.getX() - b.getX()) * (a.getX() - b.getX()) + (a.getY() - b.getY()) * (a.getY() - b.getY());
		double result = Math.sqrt(c);
		System.out.println(result);
	}
}
