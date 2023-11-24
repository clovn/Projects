import java.util.Scanner;

/*
1 variant
*/

public class Task1 {
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);

		System.out.print("Введите n: ");
		int n = reader.nextInt();

		for(int i = 1; i < 2*n; i += 2){
			int whitespacesCount = (2*n - i) / 2;
			
			printChars(' ' ,whitespacesCount);
			printChars('*', i);
			printChars(' ', whitespacesCount);

			System.out.println();
		}

		for(int i = 2*n - 3; i > 0; i -= 2){
			int whitespacesCount = (2*n - i) / 2;
			
			printChars(' ' ,whitespacesCount);
			printChars('*', i);
			printChars(' ', whitespacesCount);

			System.out.println();
		}

	}

	public static void printChars(char a, int count){
		for(int i = 0; i < count; i++){
			System.out.print(a);
		}
	}
}