package Test;

import java.util.Scanner;
//企业发放的奖金根据利润提成。利润低于或等于十万元的时候，奖金可以提百分之十;利润高于十万元，低于二十万元的时候，低于十万的
//部分按照百分之十提成，高于十万的部分按百分之七点五提成；二十到四十万之间，高于二十万的按照百分之五提成，四十万到六十万的按照
//百分之三提成；六十万到一百万的，高于六十万的按照一点五提成，高于一百万的，按照百分之一提成；从键盘输入当月利润，求当月应发奖
//金。

public class Test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入本月利润：");
		double money = sc.nextDouble();
		double gz = 0;
		if (money <= 100000 && money > 0) {
			gz = money * 0.1;
			System.out.println("您本月的奖金为：" + gz);
		} else if (money <= 200000 && money > 100000) {
			gz = 100000 * 0.1 + 0.075 * (money - 100000);
			System.out.println("您本月的奖金为：" + gz);
		} else if (money <= 400000 && money > 200000) {
			gz = 100000 * 0.1 + 0.075 * 100000 + 0.05 * (money - 200000);
			System.out.println("您本月的奖金为：" + gz);
		} else if (money <= 600000 && money > 400000) {
			gz = 100000 * 0.1 + 0.075 * 100000 + 0.05 * 200000 + 0.03 * (money - 400000);
			System.out.println("您本月的奖金为：" + gz);
		} else if (money <= 1000000 && money > 600000) {
			gz = 100000 * 0.1 + 0.075 * 100000 + 0.05 * 200000 + 0.03 * 200000 + 0.015 * (money - 600000);
			System.out.println("您本月的奖金为：" + gz);
		} else if (money <= 0) {
			System.out.println("亏钱了还想要奖金？");
		} else {
			gz = 100000 * 0.1 + 0.075 * 100000 + 0.05 * 200000 + 0.03 * 200000 + 0.015 * 400000
					+ 0.01 * (money - 1000000);
			System.out.println("您本月的奖金为：" + gz);
		}
	}

}
