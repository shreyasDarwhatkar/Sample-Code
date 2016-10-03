package cloudera;

import java.util.ArrayList;
import java.util.List;

public class SmallestComman {

	public static void main(String[] args) {
		int[] A={1,2,3,4};
		int[] B={1,7,8,9};
		int result=solution(A,B);
		System.out.println(result);

	}
	
	public static int solution(int[] A, int[] B) {
	       int smallestnumber=32767;
	       List<Integer> commanelements=new ArrayList<Integer>();
	       for(int i=0;i<=A.length-1;i++)
	       {
	           for(int j=0;j<=B.length-1;j++)
	           {
	               if(A[i]==B[j])
	               {
	               commanelements.add(B[j]);
	               break;
	               }
	               
	               
	           }
	       }
	       
	       for(int obj:commanelements)
	       {
	           if(obj<smallestnumber)
	           {
	               smallestnumber=obj;    
	           }
	       }
	       return smallestnumber;
	    
	    }

}
