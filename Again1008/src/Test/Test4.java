package Test;

import java.util.Scanner;
//��ҵ���ŵĽ������������ɡ�������ڻ����ʮ��Ԫ��ʱ�򣬽��������ٷ�֮ʮ;�������ʮ��Ԫ�����ڶ�ʮ��Ԫ��ʱ�򣬵���ʮ���
//���ְ��հٷ�֮ʮ��ɣ�����ʮ��Ĳ��ְ��ٷ�֮�ߵ�����ɣ���ʮ����ʮ��֮�䣬���ڶ�ʮ��İ��հٷ�֮����ɣ���ʮ����ʮ��İ���
//�ٷ�֮����ɣ���ʮ��һ����ģ�������ʮ��İ���һ������ɣ�����һ����ģ����հٷ�֮һ��ɣ��Ӽ������뵱����������Ӧ����
//��

public class Test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����뱾������");
		double money = sc.nextDouble();
		double gz = 0;
		if (money <= 100000 && money > 0) {
			gz = money * 0.1;
			System.out.println("�����µĽ���Ϊ��" + gz);
		} else if (money <= 200000 && money > 100000) {
			gz = 100000 * 0.1 + 0.075 * (money - 100000);
			System.out.println("�����µĽ���Ϊ��" + gz);
		} else if (money <= 400000 && money > 200000) {
			gz = 100000 * 0.1 + 0.075 * 100000 + 0.05 * (money - 200000);
			System.out.println("�����µĽ���Ϊ��" + gz);
		} else if (money <= 600000 && money > 400000) {
			gz = 100000 * 0.1 + 0.075 * 100000 + 0.05 * 200000 + 0.03 * (money - 400000);
			System.out.println("�����µĽ���Ϊ��" + gz);
		} else if (money <= 1000000 && money > 600000) {
			gz = 100000 * 0.1 + 0.075 * 100000 + 0.05 * 200000 + 0.03 * 200000 + 0.015 * (money - 600000);
			System.out.println("�����µĽ���Ϊ��" + gz);
		} else if (money <= 0) {
			System.out.println("��Ǯ�˻���Ҫ����");
		} else {
			gz = 100000 * 0.1 + 0.075 * 100000 + 0.05 * 200000 + 0.03 * 200000 + 0.015 * 400000
					+ 0.01 * (money - 1000000);
			System.out.println("�����µĽ���Ϊ��" + gz);
		}
	}

}
