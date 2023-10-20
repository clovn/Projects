import java.util.Scanner;
import java.util.regex.*;

public class Task3 {
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		String str = console.nextLine();

		Pattern p = Pattern.compile("\\+7(-[0-9]{3}){2}(-[0-9]{2}){2}");
		Matcher m = p.matcher(str);
		System.out.println(m.matches());

		int s = 0;//0 - +, 7;1 - '-'; 2 - [0-9]
		int count = 0;

		for(int i = 0; i < str.length(); i++){
			char c = str.charAt(i);
			if(s == 0){
				if(c == '+'){
					s = 1;
				} else {
					s = -1;
					break;
				}
			} else if (s == 1){
				if(c == '7'){
					s = 2;
				} else {
					s = -1;
					break;
				}
			} else if (s == 2){
				if(c == '-'){
					s = 3;
					count = i < 9 ? 3 : 2;
				} else {
					s = -1;
					break;
				}
			} else if (s == 3){
				if(Util.check('0', '9', c)){
					if(count > 1){
						s = 3;
						count--;
					} else {
						s = 2;
					}
				} else {
					s = -1;
					break;
				}
			}
		}

		System.out.println(s != -1 && s != 0);
	}
}