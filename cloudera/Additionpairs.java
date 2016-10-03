package cloudera;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Additionpairs {

	public static void main(String[] args) {
		int [] arr={-1,0,1,2,-1,-4};
		//System.out.println(getsum(arr,6,24));
		nThreeSum(arr);

	}
	
	public static String getsum(int[]input1,int input2,int input3)
	{
		for(int i=0;i<=input2-1;i++)
		{
		int sum=0;
			for(int j=i+1;j<=input2-1;j++)
			{
				for(int k=i+2;k<=input2-1;k++)
				{
				sum=input1[i]+input1[j]+input1[k];
				if(sum==input3)
				{
					System.out.println(input1[i] +","+input1[j]+","+input1[k]);
						return "true";
				}
				}
				
			}
		}
		return "false";
	}
	
	
	public static List<List<Integer>> threeSum(int[] nums) {
        int size=nums.length;
        List<Integer> digits;
        List<List<Integer>> sums= new ArrayList<List<Integer>>();
        
        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                for(int k=j+1;k<size;k++)
                {
                    if(nums[i]+nums[j]+nums[k]==0)
                    {
                        digits=new ArrayList<Integer>();
                        digits.add(nums[i]);
                        digits.add(nums[j]);
                        digits.add(nums[k]);
                        System.out.println(nums[i]+" "+nums[j]+" "+nums[k]);
                        sums.add(digits);
                    }
                }
            }
        }
        
        return sums;
    }
	
	
	 public static List<List<Integer>> nThreeSum(int[] nums) {
		 List<List<Integer>> result = new ArrayList<List<Integer>>();

	        if (nums.length < 3)
	        {
	            return result;
	        }

	        Arrays.sort(nums);

	        for (int first = 0; first < nums.length - 2; first++)
	        {
	            int second = first + 1;
	            int third = nums.length - 1;

	            if (first != 0 && nums[first] == nums[first-1])
	            {
	                continue;
	            }

	            while (second < third)
	            {
	                //since first is constant in entire loop, if second is also same as previous iteration, then 3rd value will also be same. This will help optimization and removing duplicate results
	                if (second > first + 1 && nums[second] == nums[second-1])
	                {
	                    second++;
	                    continue;
	                }

	                int sum = nums[first] + nums[second] + nums[third];

	                if (sum == 0)
	                {
	                    List<Integer> triple = new ArrayList<Integer>();
	                    triple.add(nums[first]);
	                    triple.add(nums[second]);
	                    triple.add(nums[third]);
	                    System.out.println(nums[first]+" "+nums[second]+" "+nums[third]);
	                    result.add(triple);
	                    second++;
	                    third--;
	                }
	                else if (sum > 0)
	                {
	                    third--;
	                }
	                else
	                {
	                    second++;
	                }
	            }
	        }

	        return result;
	    }

}
