package smipleproblems;

import java.util.ArrayList;
import java.util.List;

public class BuySellProblemLevel3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BuySellProblemLevel3 bs = new BuySellProblemLevel3();
		/*int [] stocks = {1,2,3,0,2};
		bs.maxProfit(stocks);
		*/		
		 List<List<Integer>> ans = new ArrayList<>();
		 bs.combination(ans, new ArrayList<Integer>(), 3, 1, 9);
	}
	 public int maxProfit(int[] prices) {//1,2,3,0,2
	      int sell = 0, 
	      prev_sell = 0, 
	      buy = Integer.MIN_VALUE,//-1 
	      prev_buy;
	        for (int price : prices) {
	            prev_buy = buy;//-1
	            buy = Math.max(prev_sell - price, prev_buy);//-1
	            prev_sell = sell;//0
	            sell = Math.max(prev_buy + price, prev_sell);//0
	        }
	    return sell;
	    }
	 
	 private void combination(List<List<Integer>> ans, List<Integer> comb, int k,  int start, int n) {
		    if (comb.size() == k && n == 0) {
		        List<Integer> li = new ArrayList<Integer>(comb);
		        ans.add(li);
		        return;
		    }
		    for (int i = start; i <= 9; i++) {
		        comb.add(i);
		        combination(ans, comb, k, i+1, n-i);
		        comb.remove(comb.size() - 1);
		    }
		}

}
