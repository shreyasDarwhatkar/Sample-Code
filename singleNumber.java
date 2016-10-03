
public class singleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arry = {4,3,2,1};
		singleNumber sn = new singleNumber();
		for(int s:sn.checkUnique(arry)){
			System.out.println(s);
		}
	}
	
	public int[] checkUnique(int[] nums) {
		  int[] res = new int[nums.length];

	        res[0] = 1;
	        for(int i=1; i < nums.length; i++) {
	            res[i] = res[i-1] * nums[i-1];
	        }
	        for(int j = nums.length - 1; j > 0; j--) {
	            res[j] *= res[0];
	            res[0] *= nums[j];
	        }
	        return res;
    }

}
