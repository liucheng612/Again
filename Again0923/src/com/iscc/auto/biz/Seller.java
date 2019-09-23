package com.iscc.auto.biz;

public class Seller {
	private String name;

	public Seller(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	/*
	 * public void setName(String name) { this.name = name; }
	 */
	public void sell(Auto auto) {
		if (auto.getIsselled() != true) {

			System.out.println("������---" + auto.getAutotype() + auto.getAno());
			auto.setIsselled(true);
		} else {
			System.out.println("�������Ѿ�������");
		}

	}

	public void sell(Auto[] autos, String autoType) {
		if (autos != null) {
			for (int i = 0; i < autos.length; i++) {
				Auto auto = autos[i];

				if (auto.getAutotype().equals(autoType) && auto.getIsselled() != true) {
					System.out.println("������---" + auto.getAutotype() + auto.getAno());
					auto.setIsselled(true);

				} else {
					System.out.println("�������Ѿ�������");
				}

			}
		}
	}

}
