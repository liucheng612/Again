package com.icss.moto.biz;

public class RentCompany {
	private String name;
	private static Moto[] motos;

	public static Moto[] getMotos() {
		return motos;
	}

	static {
		Bus b1 = new Bus("B001", 11, MotoType.GOLD_CUP, 800);
		Bus b2 = new Bus("B002", 17, MotoType.GOLD_CUP, 1500);
		Bus b3 = new Bus("B003", 50, MotoType.GOLD_LONG, 1500);

		Car c1 = new Car("C001", MotoType.BK_GL8, 600);
		Car c2 = new Car("C002", MotoType.BK_LYDA, 300);
		Car c3 = new Car("C003", MotoType.BM_550, 500);
		Car c4 = new Car("C004", MotoType.BK_LYDA, 300);

		motos = new Moto[7];
		motos[0] = b1;
		motos[1] = b2;
		motos[2] = b3;
		motos[3] = c1;
		motos[4] = c2;
		motos[5] = c3;
		motos[6] = c4;

	}

	public String getName() {
		return name;
	}

	/*
	 * public void setName(String name) { this.name = name; }
	 */

	public RentCompany(String name) {
		this.name = name;
	}

	public double rentMoto(Moto moto, int days) {
		double allmoney = 0;
		if (moto != null) {
			allmoney = moto.calRent(days);
		}
		return allmoney;
	}

}
