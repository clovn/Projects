public class Task4{
	public static void main(String[] args){
		Matrix a = new Matrix(new double[][]{{0, 1, 2}, {3, 4, 5}, {6, 7, 8}});
		Matrix b = new Matrix(new double[][]{{1, 2, 2}, {2, 2, 2}, {4, 2, 2}});
		Matrix c = Matrix.sum(a, b);
		System.out.println(c);
		Matrix d = Matrix.product(a, b);
		System.out.println(b);
		b.gauss();
		System.out.println(b);
	}
}