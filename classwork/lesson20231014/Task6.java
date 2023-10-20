import java.util.Scanner;
import java.util.regex.*;

public class Task6 {
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		String str = console.nextLine();

		Pattern p = Pattern.compile("[A-Z]?*[A-Z]");
		Matcher m = p.matcher(str);
	}
}