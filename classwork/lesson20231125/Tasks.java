import java.util.regex.*;

public class Tasks {
	public static final String VOWELS = "AEIOUYaeiouy";

	private static int countOfNegatives(int[] arr){
		int count = 0;

		for(int i : arr) {
			if(i < 0) count++;
		}

		return count;
	}

	private static int countOfVowels(String s){
		int count = 0;

		for(char i : s.toCharArray()){
			if(VOWELS.contains(Character.toString(i))) count++;
		}

		return count;
	}

	public static boolean hasNegative(int[] arr){
		return countOfNegatives(arr) > 0;
	}

	public static boolean allVowels(String s){
		return countOfVowels(s) == s.length();
	}

	public static boolean hasTwoNegative(int[] arr){
		return countOfNegatives(arr) >= 2;
	}

	public static boolean hasThreeVowels(String s){
		return countOfVowels(s) == 3;
	}

	public static boolean hasChet(int[] arr){
		for(int i : arr){
			if(i > 0 && i % 2 == 0) return true;
		}

		return false;
	}

	public static boolean hasLine3(int[][] arr){
		boolean flag = true;

		for(int[] a : arr){
			for(int i : a){
				if(i % 3 != 0) flag = false;
			}

			if(flag) return true;
		}

		return false;
	}

	private static boolean startsWithVowel(String s){
		return VOWELS.contains(Character.toString(s.charAt(0)));
	}

	public static boolean hasStringStartVowel(String[][] arr){
		boolean flag = false;

		for(int i = 0; i < arr[0].length; i++){
			for(int j = 0; j < arr.length && !flag; j++){
				if(startsWithVowel(arr[j][i])){
					flag = true;
				}
			}

			if(!flag) return false;
		}

		return true;
	}

	private static boolean chetNumber(int num){
		return Pattern.compile("[02468]*").matcher(Integer.toString(Math.abs(num))).matches();	
	}

	public static boolean hasChetNumber(int[][] arr){
		boolean flag = false;

		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[0].length && !flag; j++){
				if(chetNumber(arr[i][j])){
					flag = true;
				}
			}

			if(!flag) return false;
		}

		return true;
	}

	public static boolean hasStringStartVowel2(String[][] arr){
		for(int i = 0; i < arr[0].length; i++){
			int count = 0;

			for(int j = 0; j < arr.length; j++){
				if(startsWithVowel(arr[j][i])){
					count++;
				}

				if(count > 2) return false; 
			}
		}

		return true;
	}

	public static boolean hasChetNumber3(int[][] arr){
		for(int i = 0; i < arr.length; i++){
			int count = 0;

			for(int j = 0; j < arr[0].length && count < 3; j++){
				if(chetNumber(arr[i][j])){
					count++;
				}
			}

			if(count < 3) return false;
		}

		return true;
	}
}