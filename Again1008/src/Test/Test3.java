package Test;

public class Test3 {
	public static void main(String[] args) {

		int[][] scores = {

				{ 82, 90, 91 },

				{ 68, 72, 64 },

				{ 95, 91, 89 },

				{ 67, 52, 60 },

				{ 79, 81, 85 },

		};

		// TODO:

		double average = 0;

		double sum = 0;

		int amount = 0;

		for (int i = 0; i <= 4; i++)

		{

			for (int j = 0; j <= 2; j++)

			{

				sum += scores[i][j];

			}

			amount += 3;

		}

		average = sum / amount;

		System.out.println(average);

		if (Math.abs(average - 77.733333) < 0.000001) {

			System.out.println("²âÊÔ³É¹¦");

		} else {

			System.out.println("²âÊÔÊ§°Ü");

		}

	}
}
