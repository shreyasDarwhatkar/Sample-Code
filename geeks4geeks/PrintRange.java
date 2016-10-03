package geeks4geeks;

public class PrintRange {

	public static void main(String[] args) {
		int[] ar = {88, 105, 3, 2, 200, 0, 10};
		PrintRange fr = new PrintRange();
		fr.unSortedRange(ar);
		
	}
	public void unSortedRange(int[] arr){
		int max = 0; 
		int i = 0;
		int firstNum = 0;
		int lastNum = 0;
		for(int x : arr){
			if(max < x){
				max = x;
			}
		}
		boolean[] flag = new boolean[max+1] ;
		for(int x : arr){
			flag[x] = true;
		}
		
		while(i < max){
			if(!flag[i]){
				firstNum = i;
				i = i + 1;
				if(!flag[i]){					
					while(!flag[i]){
						i = i+1;
					}
					lastNum = i-1;
					System.out.println(firstNum + "-" + lastNum);
				}else{
					System.out.println(firstNum);
				}
			}else{
			i = i+1;
			}
		}
		
	}

}
