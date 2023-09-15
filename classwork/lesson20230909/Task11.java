public class Task11 {
	public static void main(String[] args){
		int n = Integer.valueOf(args[0]);
		int m = 1 + n*4;
		int c = 1;
		int empty = 2*n;
		String symbol = " ";
		for(int i = 1; i <= n*2; i++){
			//System.out.println(i + " " + c + " " + empty);
			for(int j = 1; j <= m;j++){
				System.out.print(symbol);
				if(j == empty){
					symbol = "*";
				} else if (j == c + empty) {
					symbol = " ";
				} else if (i > n && j == empty) {
					symbol = "*";
				} else if (i > n && j == empty + c){
					symbol = " ";
				} else if (i > n && j == m - empty - c){
					symbol = "*";
				} else if (i > n && j == m - empty){
					symbol = " ";
				}
			}
			empty -= 1;
			c += 2;
			System.out.println();
			if(i == n){
				c = 1;
			}
		}
	}
}