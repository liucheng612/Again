package test;

public class Test3 {
	// 有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...
	// 求出这个数列的前20项之和。
	public static void main(String[] args) {
		double a = 2;
		double b = 1;
		double c = 0;

		int num = 2 / 1;
		for (int i = 1; i < 20; i++) {
			c = a;
			a = a + b;
			b = c;
			num += a / b;
		}
		System.out.println(num + "=" + a + "/" + b);

		// 答案
		// int[] a = new int[20];
		// int[] b = new int[20];
		// double sum = 0.0;
		// a[0] = 2;
		// a[1] = 3;
		// b[0] = 1;
		// b[1] = 2;
		// for(int i = 2;i<20;i++){
		// a[i] = a[i-1]+a[i-2];
		// }
		// for(int j =2;j<20;j++){
		// b[j] = b[j-1]+b[j-2];
		// }
		// for(int i =0;i<20;i++){
		// sum+=a[i]/b[i];
		// }
		// System.out.println(sum);
	}

}
