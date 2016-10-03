import java.util.Scanner;


public class yepStone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		yepStone obj = new yepStone(); 
		Scanner sc = new Scanner(System.in);
		int length = Integer.parseInt(sc.next());
		String elements = sc.next();
		int count = Integer.parseInt(sc.next());
		int [] b = new int[length];
		String [] arrayElements = elements.split(" ");
		for(int i=0 ;i< length; i++){
			b[i] = Integer.parseInt(arrayElements[i]);
		}
		int[][] array = obj.convert2DArray(b);
		for(int i =0; i<12;i++ )
		{
		String []s = sc.next().toString().split(" ");
		int row = Integer.parseInt(s[0]);
		int col = Integer.parseInt(s[1]);
		System.out.print(array[row-1][col-1]);
		}

	}
	int[][] convert2DArray(int [] b){
		int col = b[0];
		int rows = b.length/col;
		int k=0;
		int[][] array = new int[rows][col];
		for(int i=0 ; i<=rows ; i++){
			for(int j=0 ; j<=col;j++ ){
				array[i][j] =b[k]; 
				k++;
			}
		}
		return array;
	}

}
