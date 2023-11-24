class Util{
	private static final double E = 0.001;

	public static boolean compare(double a, double b){
		return Math.abs(a - b) < E;
	}
}