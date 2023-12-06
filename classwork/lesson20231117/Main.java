import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);

		try{
			RationalFraction a = new RationalFraction(console.nextInt(), console.nextInt());
		} catch(ZeroDenomException e) {
			System.out.println("Denom is zero");
		}
		
	}
}