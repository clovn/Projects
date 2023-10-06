public class Task5 {
	public static void main(String[] args){
		int[][] likes = 
		{
			{0,0,0,1,0,1,1,0,0,1,0,0,0,0,0,1,0,0,1,1,0},
			{1,0,1,1,0,1,1,1,1,1,1,1,1,1,1,0,1,1,0,1,0},
			{0,0,0,1,0,0,0,1,0,1,0,0,0,0,1,0,1,0,0,1,0},
			{0,0,0,0,1,1,1,0,0,1,0,0,0,0,0,1,0,0,0,1,0},
			{1,1,1,0,1,1,1,1,1,1,1,0,0,1,1,1,1,1,1,1,0},
			{0,0,0,1,0,0,1,1,1,1,1,0,1,0,0,1,0,1,0,1,0},
			{1,1,1,1,0,1,1,1,1,1,0,1,0,1,0,1,1,0,1,1,0},
			{1,1,1,1,0,1,1,1,1,1,1,0,0,1,1,0,0,1,1,1,0},
			{1,1,1,1,1,1,1,1,1,1,1,0,0,1,1,1,1,1,1,0,0},
			{0,1,1,1,0,1,1,1,0,1,0,0,0,0,1,1,1,0,1,1,0},
			{1,1,1,1,1,1,0,1,1,1,0,1,1,0,1,1,1,0,1,1,0},
			{0,0,1,1,1,1,1,1,0,1,0,0,0,0,0,1,1,0,1,1,0},
			{1,1,1,1,0,1,1,1,1,1,1,1,1,1,0,1,1,0,0,0,0},
			{0,1,1,1,0,1,1,1,0,1,1,1,0,0,1,1,1,1,1,0,0},
 			{1,0,1,1,1,0,1,1,0,1,1,1,0,1,0,1,1,1,1,1,0},
			{0,1,1,0,1,1,1,1,0,1,1,1,1,0,0,1,0,1,0,1,0},
			{1,1,1,1,1,1,0,0,0,0,0,1,1,1,1,1,1,1,0,0,0},
			{1,1,0,0,1,0,1,0,1,1,1,1,1,1,1,1,1,1,0,0,0},
			{1,0,1,1,0,1,1,1,0,0,1,0,0,1,0,1,0,1,1,1,0},
			{0,0,0,0,0,0,1,0,0,1,0,0,0,0,0,0,0,0,1,0,0}

		}; //20 21

		for(int i = 0; i < likes.length; i++){
			int count_1 = 0;
			for(int j = 0; j < likes[i].length; j++){
				if(likes[i][j] == 1){
					count_1 += 1;
				}
			}
			likes[i][20] = count_1;
		}

		for(int i = 0; i < 20; i++){
			System.out.println(likes[i][20]);
		}


		int[] res = new int[2];//[max, h1, h2]
		double s = 0;
		double max_s = 0;

		for(int i = 0; i < likes.length; i++){
			for(int j = i+1; j < likes.length; j++){
				s = similarity(likes[i], likes[j], i);
				if(s > max_s){
					max_s = s;
					res[0] = i+1;
					res[1] = j+1;
				}
			}
		}

		System.out.println(max_s + " " + res[0] + " " + res[1]);

	}

	public static double similarity(int[] h1, int[] h2, int n){
		double k = 0;
		for(int i = 0; i < h1.length-1; i++){
			if(h1[i] == h2[i] && h1[i] == 1 && h2[i] == 1){
				k += 1;
			}
		}
		System.out.println(k + " " + h1[20] + " " + h2[20] + " " + n);
		double s = (2*k)/(h1[20] + h2[20]);

		return s;
	}
}