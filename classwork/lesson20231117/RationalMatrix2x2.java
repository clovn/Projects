public class RationalMatrix2x2 {
	private RationalFraction[][] matrix;

	public RationalMatrix2x2(RationalFraction num){
		this(num, num, num, num);
	}

	public RationalMatrix2x2(){
		this(new RationalFraction());
	}

	public RationalMatrix2x2(RationalFraction a, RationalFraction b, RationalFraction c, RationalFraction d){
		matrix = new RationalFraction[][]{{a, b}, {c, d}};
	}

	public RationalMatrix2x2 add(RationalMatrix2x2 rt){
		return new RationalMatrix2x2(matrix[0][0].add(rt.matrix[0][0]), matrix[0][1].add(rt.matrix[0][1]), matrix[1][0].add(rt.matrix[1][0]), matrix[1][1].add(rt.matrix[1][1]));
	}

	public RationalMatrix2x2 mult(RationalMatrix2x2 rt){
		RationalMatrix2x2 res = new RationalMatrix2x2();

		for(int i = 0; i < 2; i++){
			for(int j = 0; j < 2; j++){
				RationalFraction sum = new RationalFraction();

				for(int k = 0; k < 2; k++){
					sum.add(matrix[i][k].mult(rt.matrix[k][j]));
				}

				matrix[i][j] = sum;
			}
		}

		return res;
	}

	public RationalFraction det(){
		return matrix[0][0].mult(matrix[1][1]).sub(matrix[1][0].mult(matrix[0][1]));
	}

	public RationalVector2D multVector(RationalVector2D vector){
		return new RationalVector2D(matrix[0][0].mult(vector.getX()).add(matrix[0][1].mult(vector.getY())), matrix[1][0].mult(vector.getX()).add(matrix[1][1].mult(vector.getY())));
	}
}