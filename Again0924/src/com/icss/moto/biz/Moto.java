package com.icss.moto.biz;

public abstract class Moto {

	private String mno;// 车牌号
	private String color;
	private String mototype;// 车型
	private double daymoney;// 租金
	private int seatcount;// 座位

	public Moto(String mno, int seatcount, String mototype, int daymoney) {
		this.mno = mno;
		this.seatcount = seatcount;
		this.mototype = mototype;
		this.daymoney = daymoney;
	}

	public String getMno() {
		return mno;
	}

	public void setMno(String mno) {
		this.mno = mno;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMototype() {
		return mototype;
	}

	public void setMototype(String mototype) {
		this.mototype = mototype;
	}

	public double getDaymoney() {
		return daymoney;
	}

	public void setDaymoney(double daymoney) {
		this.daymoney = daymoney;
	}

	public int getSeatcount() {
		return seatcount;
	}

	public void setSeatcount(int seatcount) {
		this.seatcount = seatcount;
	}

	public double calRent(int rentDays) {

		return this.daymoney * rentDays;
	}

}
