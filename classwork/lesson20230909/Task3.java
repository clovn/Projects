public class Task3 {
	public static void main(String[] args) {
		int a = Integer.valueOf(args[0]), b = Integer.valueOf(args[1]), c = Integer.valueOf(args[2]);
		int max = a > b ? a > c ? a : c : b > c ? b : c;
		System.out.println(max);
	}
}