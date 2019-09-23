package com.icss.auto.ui;

import com.iscc.auto.biz.Auto;
import com.iscc.auto.biz.AutoType;
import com.iscc.auto.biz.Seller;

public class AutoTest {
	public static void main(String[] args) throws Exception {

		
		Auto a0 = new Auto(AutoType.getAutoName("333"), "222");
//		Auto a1;
//		Auto a2;
//		Auto a3;
//		Auto a4;
//		Auto a5;
//		Auto a6;
//		Auto a7;
//		Auto a8;
//		try {
//			a0 = new Auto("aaa", "001");
//			a1 = new Auto(AutoType.JUN_WEI, "001");
//			a2 = new Auto(AutoType.KAI_YUE, "002");
//			a3 = new Auto(AutoType.JUN_WEI, "003");
//			a4 = new Auto(AutoType.JUN_WEI, "004");
//			a5 = new Auto(AutoType.KAI_YUE, "005");
//			a6 = new Auto(AutoType.JUN_WEI, "006");
//			a7 = new Auto(AutoType.JUN_WEI, "007");
//			a8 = new Auto(AutoType.JUN_WEI, "008");
//		} catch (Exception e) {
//			
//			System.out.println("∑¢œ÷“Ï≥£");
//			return;
//		}

		/*Auto[] autos = new Auto[8];
		autos[0] = a1;
		autos[1] = a2;
		autos[2] = a3;
		autos[3] = a4;
		autos[4] = a5;
		autos[5] = a6;
		autos[6] = a7;
		autos[7] = a8;*/

		Seller seller = new Seller("∆§∆§÷Ì");

		/*
		 * seller.sell(a1); seller.sell(a3); seller.sell(a6);
		 */
		seller.sell(a0);

		/*
		 * seller.sell(autos, AutoType.KAI_YUE);
		 * 
		 * seller.sell(autos, AutoType.JUN_WEI);
		 */
	}

}
