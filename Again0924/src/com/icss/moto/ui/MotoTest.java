package com.icss.moto.ui;

import com.icss.moto.biz.Moto;
import com.icss.moto.biz.RentCompany;

public class MotoTest {
	public static void main(String[] args) {
		RentCompany company = new RentCompany("双梦出租");

		Moto moto = company.getMotos()[1];

		double allMoney = company.rentMoto(moto, 5);

		System.out.println(moto.getMototype() + "---日租金" + moto.getDaymoney() + "---总租金" + allMoney);
	}
}
