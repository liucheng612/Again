package com.icss.moto.ui;

import com.icss.moto.biz.Moto;
import com.icss.moto.biz.RentCompany;

public class MotoTest {
	public static void main(String[] args) {
		RentCompany company = new RentCompany("˫�γ���");

		Moto moto = company.getMotos()[1];

		double allMoney = company.rentMoto(moto, 5);

		System.out.println(moto.getMototype() + "---�����" + moto.getDaymoney() + "---�����" + allMoney);
	}
}
