import java.util.Scanner;
import java.util.regex.*;

public class Task4 {
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		String str = console.nextLine();

		Pattern p = Pattern.compile("1[4-9][0-9][0-9]");
		Matcher m = p.matcher(str);
		System.out.println(m.matches());

		int s = 0;
		int count = 2;
		for(int i = 0; i < str.length(); i++){
			char c = str.charAt(i);
			if(s == 0){
				if(c == '1'){
					s = 1;
				} else {
					s = -1;
				}
			} else if(s == 1){
				if(Util.check('4', '9', c)){
					s = 2;
				} else {
					s = -1;
				}
			} else if(s == 2){
				if(Util.check('0', '9', c) && count > 0){
					count--;
				} else {
					s = -1;
					break;
				}
			}
		}

		System.out.println(s != -1 && s != 0);
	}
}