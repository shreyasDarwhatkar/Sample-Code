package dynammicProgramming;

import java.util.ArrayList;

public class Permuatation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Permuatation2 p2 = new Permuatation2();
		System.out.println(p2.combinations("abc"));
	}
	
	ArrayList<String> combinations (String str){
	ArrayList<String> lstWords = new ArrayList<String>();
	if(str == null){
		return null;
	}
	if(str.length() == 0){
		lstWords.add("");
		return lstWords;
	}
	
	for(int i = 0; i< str.length();i++){
	String first = str.substring(0,i);
	String last = str.substring(i+1, str.length()); 
	ArrayList<String> result = combinations(first + last);
	
	for(String s : result){
		lstWords.add(str.charAt(i) + s );
	}
	}
        
	return lstWords;
	}

}
