public class Task10 {
	public static void main(String[] args){
		int n = Integer.valueOf(args[0]);
		for(int i = 0; i < n; i++){
			for(int j = 0; j <= i; j++){
				System.out.print(" * ");
			}
			System.out.println();
		}

		System.out.println("\n\n");

		for(int i = n; i >= 0; i--){
			for(int j = 0; j < i; j++){
				System.out.print(" * ");
			}
			System.out.println();
		}


		for(int i = n - 1; i >= 0; i--){
			String s = "   ";
			for(int j = 0; j < n; j++){
				if(j == i){
					s = " * ";
				}
				System.out.print(s);
			}
			System.out.println();
		}
	}
}