package hashMapCustom;

import java.util.PriorityQueue;

public class DriverProgram {

	public static void main(String[] args) {
		
		/*String s= "value corresponding to "
				+ "key";
		String [] sarr = s.split("\\W+");
		for(String a : sarr){
			System.out.println(a);
		}*/
		/*
		HashMapCustom hscm = new HashMapCustom();
		hscm.put(21, 12);
		hscm.put(25, 121);
		hscm.put(30, 151);
		hscm.put(33, 15);
        hscm.put(35, 89);
        System.out.println("value corresponding to key 25="
                + hscm.get(25));
        System.out.println("value corresponding to key 30="
                + hscm.get(30));
        System.out.println("value corresponding to key 33="
                + hscm.get(33));
        System.out.println("value corresponding to key 35="
                + hscm.get(35));
        System.out.println("value corresponding to key 21="
                + hscm.get(21));*/
		
		PriorityQueue<Integer> q = new PriorityQueue<Integer>(10);
		q.offer(1);
		q.offer(2);
		q.offer(5);
		q.offer(6);
		q.offer(5);
		q.offer(3);
		System.out.println(q);

	}

}
