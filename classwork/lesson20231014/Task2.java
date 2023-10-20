import java.util.Scanner;
import java.util.regex.*;

public class Task2 {
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		String str = console.nextLine();

		Pattern p = Pattern.compile("[+-]?[1-9][0-9]*|0");
		Matcher m = p.matcher(str);
		System.out.println(m.matches());

		int s = 0;// 0 - +,-,0; -1 - break; 1 - +1, -1;
		for(int i = 0; i < str.length(); i++){
			char c = str.charAt(i);
			if(s == 0){
				if(c == '0'){
					s = 3;
				} else if (c == '+' || c == '-'){
					s = 1;
				} else if (Util.check('1', '9', c)){
					s = 2;
				} else {
					s = -1;
					break;
				}
			} else if (s == 1){
				if(Util.check('1', '9', c){
					s = 2;
				} else {
					s = -1;
				}
			} else if (s == 2){
				if(!Character.isDigit(c)){
					s = -1;
					break;
				}
			} else if (s == 3){
				s = -1;
				break;
			}
		}

		System.out.println(s != -1 && s != 0);
	}
}