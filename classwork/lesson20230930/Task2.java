import java.util.Scanner;

public class Task2 {
	public static void main(String[] args){
		int n = Integer.parseInt(args[0]);

		Scanner sc = new Scanner(System.in);

		double[] a = new double[n];
		double[] b = new double[n];

		System.out.println("a: ");
		for(int i = 0; i < n; i++){
			a[i] = sc.nextDouble();
		}

		System.out.println("b: ");
		for(int i = 0; i < n; i++){
			b[i] = sc.nextDouble();
		}

		//произведение
		double s = 0;
		double lengthA = 0;
		double lengthB = 0;
		for(int i = 0; i < n; i++){
			s += a[i]*b[i];
			lengthA += Math.pow(a[i], 2);
			lengthB += Math.pow(b[i], 2);
		}


		//cos
		lengthA = Math.sqrt(lengthA);
		lengthB = Math.sqrt(lengthB);

		double cos = s / (lengthA*lengthB); 

		//arcos

		double arcos = Math.acos(cos);

		System.out.println(s + " " + cos + " " + arcos);
	}
}