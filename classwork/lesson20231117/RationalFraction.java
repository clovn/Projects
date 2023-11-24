public class RationalFraction{
	private int numer;
	private int denom;

	public RationalFraction(int numer, int denom){
		this.numer = numer;
		this.denom = denom;
	}

	public RationalFraction(){
		this(0, 1);
	}

	public void reduce(){
		int a = Math.abs(numer);
		int b = Math.abs(denom);
		
		while(a != b){
			if(a > b){
				a -= b;
			} else {
				b -= a;
			}
		}

		numer /= a;
		denom /= a;
	}

	public RationalFraction add(RationalFraction rf){
		RationalFraction res = new RationalFraction(numer*rf.denom + denom*rf.numer, denom*rf.denom);
		res.reduce();
		return res;
	}

	public void add2(RationalFraction rf){
		numer = numer*rf.denom + denom*rf.numer;
		denom = denom*rf.denom;
		reduce();
	}

	public RationalFraction sub(RationalFraction rf){
		RationalFraction res = new RationalFraction(numer*rf.denom - denom*rf.numer, denom*rf.denom);
		res.reduce();
		return res;
	}

	public void sub2(RationalFraction rf){
		numer = numer*rf.denom - denom*rf.numer;
		denom = denom*rf.denom;
		reduce();
	}

	public RationalFraction mult(RationalFraction rf){
		RationalFraction res = new RationalFraction(numer*rf.numer, denom*rf.denom);
		res.reduce();
		return res;
	}

	public void mult2(RationalFraction rf){
		numer *= rf.numer;
		denom *= rf.denom;
		reduce();
	}

	public RationalFraction div(RationalFraction rf){
		RationalFraction res = new RationalFraction(numer*rf.denom, denom*rf.numer);
		res.reduce();
		return res;
	}

	public void div2(RationalFraction rf){
		numer *= rf.denom;
		denom *= rf.numer;
		reduce();
	}

	public String toString(){
		return numer + "/" + denom;
	}

	public double value(){
		return numer/(double) denom;
	}

	public boolean equals(RationalFraction rf){
		reduce();
		rf.reduce();
		return numer == rf.numer && denom == rf.denom;
	}

	public int numberPart(){
		return (int) value();
	}
}