import java.util.Scanner;

/*
1 variant
*/

public class Task2 {
	public static void main(String[] args){
		final double ESP = 1e-9;
		Scanner reader = new Scanner(System.in);

		System.out.print("Введите x: ");
		double x = reader.nextDouble();

		double result1 = 0;
		double term = x + 2;
		int k = 0;

		while(Math.abs(term) > ESP && k < 20){
			result1 += term;
			k++;
			term *= x/(k + 1);
		}

		System.out.println(result1);
	}
}