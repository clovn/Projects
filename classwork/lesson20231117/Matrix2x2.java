public class Matrix2x2 {
	private double[][] matrix;

	public Matrix2x2(double[][] matrix){
		this.matrix = matrix;
	}

	public Matrix2x2(double num){
		this(num, num, num, num);
	}

	public Matrix2x2(){
		this(0);
	}

	public Matrix2x2(double a, double b, double c, double d){
		this(new double[][]{{a, b}, {c, d}});
	}

	public Matrix2x2 add(Matrix2x2 m){
		Matrix2x2 res = new Matrix2x2();
		for(int i = 0; i < 2; i++){
			for(int j = 0; j < 2; j++){
				res.matrix[i][j] = matrix[i][j] + m.matrix[i][j];
			}
		}

		return res;
	}

	public void add2(Matrix2x2 m){
		for(int i = 0; i < 2; i++){
			for(int j = 0; j < 2; j++){
				matrix[i][j] += m.matrix[i][j];
			}
		}
	}

	public Matrix2x2 sub(Matrix2x2 m){
		Matrix2x2 res = new Matrix2x2();
		for(int i = 0; i < 2; i++){
			for(int j = 0; j < 2; j++){
				res.matrix[i][j] = matrix[i][j] - m.matrix[i][j];
			}
		}

		return res;	
	}

	public void sub2(Matrix2x2 m){
		for(int i = 0; i < 2; i++){
			for(int j = 0; j < 2; j++){
				matrix[i][j] -= m.matrix[i][j];
			}
		}
	}

	public Matrix2x2 multNumber(double num){
		Matrix2x2 res = new Matrix2x2();
		for(int i = 0; i < 2; i++){
			for(int j = 0; j < 2; j++){
				res.matrix[i][j] = matrix[i][j]*num;
			}
		}

		return res;	
	}

	public void multNumber2(double num){
		for(int i = 0; i < 2; i++){
			for(int j = 0; j < 2; j++){
				matrix[i][j] *= num;
			}
		}
	}

	public Matrix2x2 mult(Matrix2x2 m){
		Matrix2x2 res = new Matrix2x2();

		for(int i = 0; i < 2; i++){
			for(int j = 0; j < 2; j++){
				for(int k = 0; k < 2; k++){
					res.matrix[i][j] += matrix[i][k]*m.matrix[k][j];
				}
			}
		}

		return res;
	}

	public void mult2(Matrix2x2 m){
		Matrix2x2 res = new Matrix2x2();

		for(int i = 0; i < 2; i++){
			for(int j = 0; j < 2; j++){
				for(int k = 0; k < 2; k++){
					res.matrix[i][j] += matrix[i][k]*m.matrix[k][j];
				}
			}
		}

		matrix = res.matrix;
	}

	public double det(){
		return matrix[0][0]*matrix[1][1] - matrix[0][1]*matrix[1][0];
	}

	public void transpon(){
		double temp = matrix[0][1];
		matrix[0][1] = matrix[1][0];
		matrix[1][0] = temp;
	}

	public Matrix2x2 inverseMatrix(){
        if (det() == 0) {
            throw new IllegalArgumentException("Обратной матрицы не существует, так как определитель равен 0.");
        }

        double inverseDet = 1/det();
        double[][] inverse = new double[][]{{matrix[1][1] * inverseDet, -matrix[1][0] * inverseDet}, {-matrix[0][1] * inverseDet, matrix[0][0] * inverseDet}};

        return new Matrix2x2(inverse);
	}

	public Matrix2x2 equivalentDiagonal(){
		double[][] res = new double[][]{{matrix[0][0], 0}, {0, matrix[1][1] + matrix[0][1]*(-matrix[1][0]/matrix[0][0])}};

		return new Matrix2x2(res);
	}

	public Vector2D multVector(Vector2D vector){
		return new Vector2D(matrix[0][0]*vector.getX() + matrix[0][1]*vector.getY(), matrix[1][0]*vector.getX() + matrix[1][1]*vector.getY());
	}














}