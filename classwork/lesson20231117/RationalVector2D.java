public class RationalVector2D {
	private RationalFraction x;
	private RationalFraction y;

	public RationalVector2D(RationalFraction x, RationalFraction y){
		this.x = x;
		this.y = y;
	}

	public RationalVector2D(){
		this(new RationalFraction(), new RationalFraction());
	}

	public RationalVector2D add(RationalVector2D vector){
		return new RationalVector2D(x.add(vector.x), y.add(vector.y));
	}

	public String toString(){
		return "(" + x + ", " + y + ")";
	}

	public double length(){
		return Math.sqrt(x.mult(x).value() + y.mult(y).value());
	}

	public RationalFraction scalarProduct(RationalVector2D vector){
		return x.mult(vector.x).add(y.mult(vector.y));
	}

	public boolean equals(RationalVector2D vector){
		return x.equals(vector.x) && y.equals(vector.y);
	}

	public RationalFraction getX(){
		return x;
	}

	public RationalFraction getY(){
		return y;
	}
}