public class Vector2D {
	private double x;
	private double y;

	public Vector2D(){
		this(0, 0);
	}

	public Vector2D(double x, double y){
		this.x = x;
		this.y = y;
	}

	public double getX(){
		return x;
	}

	public double getY(){
		return y;
	}

	public Vector2D add(Vector2D vector){
		return new Vector2D(x + vector.x, y + vector.y);
	}

	public void add2(Vector2D vector){
		x += vector.x;
		y += vector.y;
	}

	public Vector2D sub(Vector2D vector){
		return new Vector2D(x - vector.x, y - vector.y);
	}

	public void sub2(Vector2D vector){
		x -= vector.x;
		y -= vector.y;
	}

	public Vector2D mult(double num){
		return new Vector2D(x * num, y * num);
	}

	public void mult2(double num){
		x *= num;
		y *= num;
	}

	public double length(){
		return Math.sqrt(x*x + y*y);
	}

	public double scalarProduct(Vector2D vector){
		return x*vector.x + y*vector.y;
	}

	public double cos(Vector2D vector){
		return scalarProduct(vector)/(length() * vector.length());
	}

	public String toString(){
		return "(" + x + ", " + y + ")";
	}

	public boolean equals(Vector2D vector){
		return Util.compare(x, vector.x) && Util.compare(y, vector.y);
	}
}