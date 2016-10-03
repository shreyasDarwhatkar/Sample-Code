package ImplementPriorityQueue;

import java.util.Comparator;

public class Mycomparator implements Comparator<Integer> {

	@Override
	public int compare(Integer arg0, Integer arg1) {
		Integer i0 = arg0;
		Integer i1 = arg1;
		//System.out.println(i0 + " vs "+ i1);
		if(i0<i1)
			return -1;
		else if (i1<i0)
			return 1;
		else
			return 0;
		
	}

}
