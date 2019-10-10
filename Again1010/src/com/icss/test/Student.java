package com.icss.test;

public class Student {

	private int ID;
	private String name;
	private double score;

	public void SetRecord(int ID, String name, double score) {
		this.ID = ID;
		this.name = name;
		this.score = score;
	}

	public double getRecord(int ID) {
		if (ID == this.ID)
			return this.score;
		else
			return -1;
	}

	public static void main(String[] args) {
		Student s = new Student();
		s.SetRecord(0, "lc", 100);
		double Sco = s.getRecord(0);
		System.out.println(Sco);
	}
}
