public class ComplexNumber{
	private double real;
	private double im;

	public ComplexNumber(double real, double im){
		this.real = real;
		this.im = im;
	}

	public ComplexNumber(){
		this(0, 0);
	}

	public ComplexNumber add(ComplexNumber c){
		return new ComplexNumber(real + c.real, im + c.im);
	}

	public void add2(ComplexNumber c){
		real += c.real;
		im += c.im;
	}

	public ComplexNumber sub(ComplexNumber c){
		return new ComplexNumber(real - c.real, im - c.im);
	}

	public void sub2(ComplexNumber c){
		real -= c.real;
		im -= c.im;
	}

	public ComplexNumber multNumber(double num){
		return new ComplexNumber(real*num, im*num);
	}

	public void multNumber2(double num){
		real *= num;
		im *= num;
	}

	public ComplexNumber mult(ComplexNumber c){
		return new ComplexNumber(real*c.real - im*c.im, real*c.im - im*c.real);
	}

	public void mult2(ComplexNumber c){
		real = real*c.real - im*c.im;
		im = real*c.im - im*c.real;
	}

	public ComplexNumber div(ComplexNumber c){
		return new ComplexNumber((real*c.real + im*c.im) / (c.real*c.real + c.im*c.im), (im*c.real - real*c.im) / (c.real*c.real + c.im*c.im));
	}

	public void div2(ComplexNumber c){
		real = (real*c.real + im*c.im) / (c.real*c.real + c.im*c.im);
		im = (im*c.real - real*c.im) / (c.real*c.real + c.im*c.im);
	}

	public double length(){
		return Math.sqrt(real*real + im*im);
	}

	public String toString(){
		if(real < 0){
			return im + "*i - " + real;
		}

		return im + "*i + " + real;
	}

	public double arg(){
		return Math.atan(im/real);
	}

	public ComplexNumber pow(double n){
		double r = Math.pow(length(), n);
		return new ComplexNumber(r*Math.cos(n*arg()), r*Math.sin(n*arg()));
	}

	public boolean equals(ComplexNumber c){
		return Util.compare(real, c.real) && Util.compare(im, c.im);
	}
}