public class Task1 {
	public static void main(String[] args){
		int n = args.length-1;
		int x = Integer.parseInt(args[0]);
		int[] arr = new int[n];
		boolean include1 = false;
		boolean include2 = false;

		for(int i = 0; i < n; i++){
			arr[i] = Integer.parseInt(args[i+1]);
		}

		for(int i : arr) {
			if(i == x){
				include1 = true;
			}
		}

		System.out.println(include1);

		int start = 0;
		int end = arr.length - 1;
		int middle = 0;

		while(!include2 && start < end){
			middle = start + (end - start) / 2; 
			if(arr[middle] == x){
				include2 = true;
			} else if (x > arr[middle]) {
				start = middle + 1;
			} else {
				end = middle;
			}
		}

		System.out.println(include2);
	}
}
