import java.util.Scanner;
import java.util.regex.*;

public class Task1 {
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		String str = console.nextLine();

		Pattern p = Pattern.compile("[1-9][0-9]*");
		Matcher m = p.matcher(str);
		System.out.println(m.matches());

		int s = 0;
		for(int i = 0; i < str.length(); i++){
			Char c = str.charAt(i);
			if(s == 0){
				if(Util.check('1', '9', c)){
					s = 1;
				} else {
					s = -1;
					break;
				}
			} else if (s == 1) {
				if(Util.check('1', '9', c)){
					s = - 1;
					break;
				}
			}
		}

		System.out.println(s != -1 && s != 0);
	}
}