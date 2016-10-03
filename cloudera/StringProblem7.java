package cloudera;

public class StringProblem7 {
	
	public static void transform(int[][] matrix){
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
		// TODO Auto-generated method stub

	}

}
