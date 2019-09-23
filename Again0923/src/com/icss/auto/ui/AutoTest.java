package com.icss.auto.ui;

import com.iscc.auto.biz.Auto;
import com.iscc.auto.biz.AutoType;
import com.iscc.auto.biz.Seller;

public class AutoTest {
	public static void main(String[] args) {
		Auto a1 = new Auto(AutoType.JUN_WEI, "001");
		Auto a2 = new Auto(AutoType.KAI_YUE, "002");
		Auto a3 = new Auto(AutoType.JUN_WEI, "003");
		Auto a4 = new Auto(AutoType.JUN_WEI, "004");
		Auto a5 = new Auto(AutoType.KAI_YUE, "005");
		Auto a6 = new Auto(AutoType.JUN_WEI, "006");
		Auto a7 = new Auto(AutoType.JUN_WEI, "007");
		Auto a8 = new Auto(AutoType.JUN_WEI, "008");

		Auto[] autos = new Auto[8];
		autos[0] = a1;
		autos[1] = a2;
		autos[2] = a3;
		autos[3] = a4;
		autos[4] = a5;
		autos[5] = a6;
		autos[6] = a7;
		autos[7] = a8;

		Seller seller = new Seller("∆§∆§÷Ì");

		seller.sell(a1);
		seller.sell(a3);
		seller.sell(a6);

		seller.sell(autos, AutoType.KAI_YUE);

		seller.sell(autos, AutoType.JUN_WEI);
	}

}
