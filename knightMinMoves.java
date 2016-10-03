
public class knightMinMoves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		knightMinMoves obj = new knightMinMoves();
		System.out.println(obj.minMoves(4, 5));
	}

	public int minMoves(int a , int b){
		int dist = a + b;
		if(dist == 0){
			return 0;
		}else if(dist ==3){
			return 3;
		}else if(dist == 2){
			return 2;
		}else if(dist == 1){
			return 3;
		}
		int moves =0 ;
		if(a>b){
			moves = a/2;
			a -= moves*2;
			b-= moves;
			return moves+ minMoves(a,b);
		}
		else{
			moves = a/2;
			b -= moves*2;
			a-= moves;
			return moves+ minMoves(a,b);
		}
	} 
}
