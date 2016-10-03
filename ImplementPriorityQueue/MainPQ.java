package ImplementPriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MainPQ {

	public static void main(String[] args) {
		//Comparator<Integer> cmp=new Mycomparator();
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		pq.add(4);
		pq.add(6);
		pq.add(7);
		pq.add(9);
		pq.add(10);
		pq.add(12);
		//pq.add(0);
		pq.add(1);
		pq.add(2);
		pq.add(3);
		pq.add(5);
		//pq.add(-1);
		System.out.println(pq.remove());
		System.out.println(pq.poll());



	}

}
