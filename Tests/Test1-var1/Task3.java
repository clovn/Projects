import java.util.Scanner;

/*
1 variant
*/

public class Task3 {
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);

		System.out.print("Введите координаты (x, y): ");
		double x = reader.nextDouble();
		double y = reader.nextDouble();

		if((x >= 0 && (x*x + (y-3)*(y-3)) <= 1) || 
			((y >= (-x - 2)) && (y >= (x - 2)) && (y <= 1) && (y >= -1))){
			System.out.println("Точка попадает");
		} else {
			System.out.println("Точка не попадает");
		}
	}
}