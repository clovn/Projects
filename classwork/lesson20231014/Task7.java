import java.util.Scanner;
import java.util.regex.*;

public class Task7 {
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		String str = console.nextLine();

		Pattern p = Pattern.compile("[A-Za-z_-][A-Za-z0-9_-]*");
		Matcher m = p.matcher(str);

		System.out.println(m.matches());


		int s = 0;
		for(int i = 0; i < str.length(); i++){
			char c = str.charAt(i);
			if(s == 0){
				if(Util.checkAllChar(c) || c == '-' || c == '_'){
					s = 1;
				} else {
					s = -1;
				}
			} else if(s == 1){
				if(Util.checkAllChar(c) || Util.check('0', '9', c)){
					s = 2;
				} else {
					s = -1;
				}
			} 
		}

		System.out.println(s == 2 || s == 1);
	}
}