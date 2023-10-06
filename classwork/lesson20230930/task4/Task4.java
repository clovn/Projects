import java.util.Scanner;

public class Task4{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);

		System.out.print("Введите размерность матрицы A через пробел: ");
		Matrix a = Matrix.enterMatrix(reader.nextInt(), reader.nextInt(),reader);
		
		System.out.print("Введите размерность матрицы B через пробел: ");
		Matrix b = Matrix.enterMatrix(reader.nextInt(), reader.nextInt(), reader);
		
		Matrix c = Matrix.product(a, b);

		System.out.println(a);
		System.out.println(b);

		System.out.println(c);

		// Matrix d = Matrix.product(a, b);

		

		a.gauss();

		System.out.println(a);
	}
}