public class Task3 {
	public static void main(String[] args){
		BigLong a = new BigLong("930");
		BigLong b = new BigLong("123");

		BigLong c = BigLong.sum(a, b);

		System.out.println(a + " + " + b);
		System.out.println(c);

		BigLong d = BigLong.product(a, 5);

		System.out.println(a + " * " + 5);
		System.out.println(d);
	}
}