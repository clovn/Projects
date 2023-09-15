import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Task6 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.valueOf(reader.readLine()), y = Integer.valueOf(reader.readLine());
		if((x*x + y*y) <= 16 && (y >= 2 || (x >= 0 && y <= 0))) {
			System.out.println("Координата (" + x + ", " + y + ") попадает");
		} else {
			System.out.println("Координата (" + x + ", " + y + ") не попадает");
		}
	}
}