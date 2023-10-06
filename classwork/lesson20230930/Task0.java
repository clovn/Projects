public class Task0 {
	public static void main(String[] args){
		int n = args.length;
		int[] arr = new int[n];

		for(int i = 0; i < n; i++){
			arr[i] = Integer.parseInt(args[i]);
		}

		int max = arr[0];

		for(int i = 1;i < n; i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}

		System.out.println(max);
	}
}