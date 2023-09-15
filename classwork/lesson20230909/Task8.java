public class Task8 {
	public static void main(String[] args){
		int s = 0;
		for(String arg : args){
			s += Integer.valueOf(arg);
		}
		System.out.println("сумма = " + s);
	}
}