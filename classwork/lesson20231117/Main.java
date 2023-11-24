public class Main{
	public static void main(String[] args){
		RationalFraction a = new RationalFraction(-12, 8);
		RationalFraction b = new RationalFraction(1, 2);
		a.reduce();
		System.out.println(a);
	}
}