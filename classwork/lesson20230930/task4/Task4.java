import java.util.Scanner;

public class Task4{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);

		Matrix a = Matrix.enterMatrix(reader.nextInt(), reader.nextInt(),reader);
		Matrix b = new Matrix(new double[][]{{1, 2, 2}, {2, 2, 2}, {4, 2, 2}});
		Matrix c = Matrix.sum(a, b);

		System.out.println(c);

		Matrix d = Matrix.product(a, b);

		System.out.println(b);

		a.gauss();

		System.out.println(a);
	}
}