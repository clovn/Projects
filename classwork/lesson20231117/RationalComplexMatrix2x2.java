public class RationalComplexMatrix2x2 {
	private RationalComplexNumber[][] matrix;

	public RationalComplexMatrix2x2(RationalComplexNumber a, RationalComplexNumber b, RationalComplexNumber c, RationalComplexNumber d){
		matrix = new RationalComplexNumber[][]{{a, b}, {c, d}};
	}

	public RationalComplexMatrix2x2(RationalComplexNumber num){
		this(num, num, num, num);
	}

	public RationalComplexMatrix2x2(){
		this(new RationalComplexNumber());
	}

	public RationalComplexMatrix2x2 add(RationalComplexMatrix2x2 rc){
		return new RationalComplexMatrix2x2(matrix[0][0].add(rc.matrix[0][0]), matrix[0][1].add(rc.matrix[0][1]), matrix[1][0].add(rc.matrix[1][0]), matrix[1][1].add(rc.matrix[1][1]));
	}

	public RationalComplexMatrix2x2 mult(RationalComplexMatrix2x2 rc){
		RationalComplexMatrix2x2 res = new RationalComplexMatrix2x2();

		for(int i = 0; i < 2; i++){
			for(int j = 0; j < 2; j++){
				RationalComplexNumber sum = new RationalComplexNumber();

				for(int k = 0; k < 2; k++){
					sum.add(matrix[i][k].mult(rc.matrix[k][j]));
				}

				matrix[i][j] = sum;
			}
		}

		return res;
	}

	public RationalComplexNumber det(){
		return matrix[0][0].mult(matrix[1][1]).sub(matrix[1][0].mult(matrix[0][1]));
	}

	public RationalComplexVector2D multVector(RationalComplexVector2D vector){
		return new RationalComplexVector2D(matrix[0][0].mult(vector.getX()).add(matrix[0][1].mult(vector.getY())), matrix[1][0].mult(vector.getX()).add(matrix[1][1].mult(vector.getY())));
	}
}