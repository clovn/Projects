public class Util{
	public static boolean check(char left, char right, char num){
		return num >= left && num <= right;
	}

	public static boolean checkVowelsChar(char c){
		return c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'Y';
	}

	public static boolean checkAllChar(char c){
		return 'A' <= c && c <= 'z' || c == '-' || c == '-'; 
	}
}