import java.util.Scanner;
import java.util.regex.*;

public class Task9 {
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		String str = console.nextLine();

		Pattern p = Pattern.compile("[A-Za-z_-][A-Za-z0-9_-]*[=]([A-Za-z_-][A-Za-z0-9_-]*|[1-9][0-9]*)[+\\-*/]([A-Za-z_-][A-Za-z0-9_-]*|[1-9][0-9]*)");
		Matcher m = p.matcher(str);

		System.out.println(m.matches());

		//0 - начало, если дощли до = то 1
		//1 - выражение, если дошли до оператора то 2

		int s = 0;

		for(int i = 0; i < str.length(); i++){
			char c = str.charAt(i);
			if(s == 0){
				if(Util.checkAllChar(c)){
					s = 1;
				} else {
					s = -1;
				}
			} else if (s == 1){
				if(Util.checkAllChar(c) || Util.check('0', '9', c)){
					s = 1;
				} else if(c == '='){
					s = 2;
				} else {
					s = -1;
				}
			} else if(s == 2){
				if(Util.checkAllChar(c)){
					s = 3;
				} else if(Util.check('1', '9', c)) {
					s = 4;
				} else {
					s = -1;
				}
			} else if(s == 3){
				if(Util.checkAllChar(c) || Util.check('0', '9', c)){
					s = 3;
				} else if(c == '*' || c == '+' || c == '-' || c == '/'){
					s = 2;
				} else {
					s = -1;
				}
			} else if(s == 4){
				if(Util.check('0', '9', c)){
					s = 4;
				} else if(c == '*' || c == '+' || c == '-' || c == '/'){
					s = 2; 
				} else {
					s = -1;
				}
			}
		}

		System.out.println(s == 3 || s == 4);
	}
}