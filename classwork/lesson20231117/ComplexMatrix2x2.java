public class ComplexMatrix2x2 {
	private ComplexNumber[][] matrix;

	public ComplexMatrix2x2(ComplexNumber a, ComplexNumber b, ComplexNumber c, ComplexNumber d){
		matrix = new ComplexNumber[][]{{a, b}, {c, d}};
	}

	public ComplexMatrix2x2(ComplexNumber num){
		this(num, num, num, num);
	}

	public ComplexMatrix2x2(){
		this(new ComplexNumber());
	}

	public ComplexMatrix2x2 add(ComplexMatrix2x2 cm){
		return new ComplexMatrix2x2(matrix[0][0].add(cm.matrix[0][0]), matrix[0][1].add(cm.matrix[0][1]), matrix[1][0].add(cm.matrix[1][0]), matrix[1][1].add(cm.matrix[1][1]));
	}

	public ComplexMatrix2x2 mult(ComplexMatrix2x2 cm){
		ComplexMatrix2x2 res = new ComplexMatrix2x2();

		for(int i = 0; i < 2; i++){
			for(int j = 0; j < 2; j++){
				ComplexNumber sum = new ComplexNumber();

				for(int k = 0; k < 2; k++){
					sum.add(matrix[i][k].mult(cm.matrix[k][j]));
				}

				matrix[i][j] = sum;
			}
		}

		return res;
	}

	public ComplexNumber det(){
		return matrix[0][0].mult(matrix[1][1]).sub(matrix[1][0].mult(matrix[0][1]));
	}

	public ComplexVector2D multVector(ComplexVector2D vector){
		return new ComplexVector2D(matrix[0][0].mult(vector.getX()).add(matrix[0][1].mult(vector.getY())), matrix[1][0].mult(vector.getX()).add(matrix[1][1].mult(vector.getY())));
	}
}