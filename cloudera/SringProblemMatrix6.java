package cloudera;

public class SringProblemMatrix6 {
	
	public static void rotate(int[][] matrix){
		int l=matrix.length;
		for(int i=0;i<l/2;i++){
			for(int j=i;j<l-i-1;j++){
				int t=matrix[i][j];
				matrix[i][j]=matrix[j][l-i-1];
				matrix[j][l-i-1]=matrix[l-i-1][l-j-1];
				matrix[l-i-1][l-j-1]=matrix[l-j-1][i];
				matrix[l-j-1][i]=t;
			}
		}
		
	}

	public static void main(String[] args) {
		int matrix[][] = new int[][] { { 1, 2, 3},
				{ 4,5,6 }, {7,8,9}};
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}

		
		rotate(matrix);
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}

	}

}
