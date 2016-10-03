package recursion;

public class Recursion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recursion1 r = new Recursion1();
		int [] result = r.countBits(10);
		for(int i : result){
			System.out.println(i);
		}
		

	}
	public int[] countBits(int num) {
		if(num < 0) return new int[]{0};

	    int[] r = new int[num+1];
	    r[0] = 0;

	    if(num == 0) return r;

	    int exp = 1;
	    int limt = 1;
	    int lim = 2;
	    r[1] = 1;

	    for(int i = 2; i <= num; i++) {

	        if(i == lim) {
	            r[i] = 1;
	            exp++;
	            limt = lim;
	            lim = (int)Math.pow(2.0,(double)exp);
	            continue;
	        }
	        r[i] = 1 + r[i-limt]; 

	    }

	    return r;
	}

}
