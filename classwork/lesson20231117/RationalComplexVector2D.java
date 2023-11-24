public class RationalComplexVector2D {
	private RationalComplexNumber x;
	private RationalComplexNumber y;

	public RationalComplexVector2D(RationalComplexNumber x, RationalComplexNumber y){
		this.x = x;
		this.y = y;
	}

	public RationalComplexVector2D(){
		this(new RationalComplexNumber(), new RationalComplexNumber());
	}

	public RationalComplexVector2D add(RationalComplexVector2D vector){
		return new RationalComplexVector2D(x.add(vector.x), y.add(vector.y));
	}

	public String toString(){
		return "(" + x + ", " + y + ")";
	}

	public RationalComplexNumber scalarProduct(RationalComplexVector2D vector){
		return x.mult(vector.x).add(y.mult(vector.y));
	}
}