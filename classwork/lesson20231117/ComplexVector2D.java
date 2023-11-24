public class ComplexVector2D {
	private ComplexNumber x;
	private ComplexNumber y;

	public ComplexVector2D(ComplexNumber x, ComplexNumber y){
		this.x = x;
		this.y = y;
	}

	public ComplexVector2D(){
		this(new ComplexNumber(), new ComplexNumber());
	}

	public ComplexVector2D add(ComplexVector2D vector){
		return new ComplexVector2D(x.add(vector.x), y.add(vector.y));
	}

	public String toString(){
		return "(" + x + ", " + y + ")";
	}

	public ComplexNumber scalarProduct(ComplexVector2D vector){
		return x.mult(vector.x).add(y.mult(vector.y));
	}

	public boolean equals(ComplexVector2D vector){
		return x.equals(vector.x) && y.equals(vector.y);
	}

	public ComplexNumber getX(){
		return x;
	}

	public ComplexNumber getY(){
		return y;
	}
}