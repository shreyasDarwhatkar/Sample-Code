package dynammicProgramming;

import java.util.ArrayList;


public class Permutation {

	public static void main(String[] args) {
		Integer a= 5;
		int b= 10;
		
		
				
				Object obj = new Object();
				
		// TODO Auto-generated method stub
		Permutation p = new Permutation();
		System.out.println(p.combinations("abc"));
	}
	
	
	ArrayList<String> combinations(String str){
		ArrayList<String> permutationList = new ArrayList<>();
		if(str == null)
			return null;
		if(str.length() == 0){
			permutationList.add("");
		 return permutationList;
		}
		
		char first = str.charAt(0);
		String remainder = str.substring(1);
		
		ArrayList<String> result = combinations(remainder); 
		
		for(String s : result){
			for(int i = 0 ; i <= s.length(); i++){
				permutationList.add(insertAtChar(s,first, i));
			}
		}
		
		return permutationList;
	}
	
	String insertAtChar(String s, char c, int j){
	String start = s.substring(0,j);
	String end = s.substring(j);
	return start + c + end;
	}
	

}
