public class RationalComplexNumber {
	private RationalFraction real;
	private RationalFraction im;

	public RationalComplexNumber(RationalFraction real, RationalFraction im){
		this.real = real;
		this.im = im;
	}

	public RationalComplexNumber(){
		this(new RationalFraction(), new RationalFraction());
	}

	public RationalComplexNumber add(RationalComplexNumber rc){
		return new RationalComplexNumber(real.add(rc.real), im.add(rc.im));
	}

	public RationalComplexNumber sub(RationalComplexNumber rc){
		return new RationalComplexNumber(real.sub(rc.real), im.sub(rc.im));
	}

	public RationalComplexNumber mult(RationalComplexNumber rc){
		return new RationalComplexNumber(real.mult(rc.real).sub(im.mult(rc.im)), real.mult(rc.im).sub(im.mult(rc.real)));
	}

	public String toString(){
		if(real.value() < 0){
			return im + "*i - " + real;
		}

		return im + "*i + " + real;
	}
}