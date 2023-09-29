

public class MaclSer{
	public static void main(String[] args) {
		String func = args[0];
		double x = Double.valueOf(args[1]);
		double res = 0.0;
		boolean right = false;

		try{
            Utils.setN(Integer.valueOf(args[2]));
        } catch (Exception e){
            switch (func){
                case "sin":
                    Utils.setN(20);
                    break;
                case "cos":
                    Utils.setN(5);
                    break;
                case "e":
                    Utils.setN(20);
                    break;
                case "ln1":
                    Utils.setN(30);
                    break;
            }
        }

		if (func.equals("sin")) {
			double rads = Utils.degreesToRadians(x);
			res = Utils.sin(rads);
			right = Utils.isRight(res, Math.sin(rads), 1e-7);
		} else if (func.equals("cos")) {
			double rads = Utils.degreesToRadians(x);
			res = Utils.cos(rads);
			right = Utils.isRight(res, Math.cos(rads), 1e-7);
		} else if (func.equals("e")){
			res = Utils.e(x);
			right = Utils.isRight(res, Math.pow(Math.E, x), 1e-10);
		} else if (func.equals("ln1")) {
			res = Utils.ln1(x);
			right = Utils.isRight(res, Math.log1p(x), 1e-10);
		}

		System.out.println(res + " " + right);
	}
}

class Utils{
	private static int N = 5;

	public static void setN(int n){
		N = n;
	}

	public static double degreesToRadians(double degrees){
		return (degrees * Math.PI) / 180.0;
	}

	public static boolean isRight(double result, double right, double delta){
		if(Math.abs(result - right) < delta){
			return true;
		} else {
			return false;
		}
	}

	public static double e(double x){
		double result = 1;
		long fact = 1;

		for(int i = 1; i < N; i++){
			fact *= i;
			result += Math.pow(x, i) / fact;
		}

		return result;
	}

	public static double sin(double x) {
		double sinValue = 0;
		long fact = 1;
		int f = 1;

		for(int i = 1; i <= N;i++) {
			sinValue += Math.pow(-1, i+1) * Math.pow(x, 2*i - 1) / fact;
			fact *= (f + 1)*(f + 2);
			f += 2;
		}

		return sinValue;
	}
	
	public static double cos(double x) {
		double cosValue = 0;
		long fact = 1;
		int f = 1;

		for(int i = 0; i < N;i++) {
			cosValue += Math.pow(-1, i) * Math.pow(x, 2*i) / fact;
			for(int j = f; j <= f*2; j++){
				fact *= j;
			}
			f *= 2;
		}

		return cosValue;
	}

	public static double ln1(double x){
		double result = 0;

		for(int i = 1; i <= N; i++){
			result += Math.pow(-1, i-1)*Math.pow(x, i) / i;
		}

		return result;
	}

}