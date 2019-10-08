package Test;

import java.util.Arrays;

public class Test2 {

	public class ForEach {

		public void main(String[] args) {

			int[] ns = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };

			// ≈≈–Ú«∞:

			System.out.println(Arrays.toString(ns));

			for (int i = ns.length - 1; i >= 0; i--) {

				for (int j = i - 1; j >= 0; j--)

				{

					if (ns[i] > ns[j]) {

						int t = ns[i];

						ns[i] = ns[j];

						ns[j] = t;

					}

				}

			}

			// ≈≈–Ú∫Û£∫

			System.out.println(Arrays.toString(ns));

			if (Arrays.toString(ns).equals("[96, 89, 73, 65, 50, 36, 28, 18, 12, 8]")) {

				System.out.println("≤‚ ‘≥…π¶");

			} else {

				System.out.println("≤‚ ‘ ß∞‹");

			}

		}

	}

}
