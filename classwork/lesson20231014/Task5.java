import java.util.Scanner;

public class Task5{
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		String str = console.nextLine().toLowerCase();

		int k = 0;

		for(int i = 0; i < str.length(); i++){
			char c = str.charAt(i);
			if(Character.isLetter(c)){
				if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'y' || c == 'u'){
					k += 1;
				} else {
					k -= 1;
				}
			}
		}

		System.out.println(k > 0);
	}
}