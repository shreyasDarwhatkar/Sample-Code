import java.util.HashMap;
import java.util.Map.Entry;


public class codilityProblem1 {

	public static void main(String[] args) {
		int a[]={10,30,10,30,50,10,30,20,30};
		int ans=solution(a,9);
		System.out.println(ans);
	}
	
	public static int solution(int[]a,int n)
	{
		//a.length
		int freqNumber=0;
		HashMap<Integer, Integer> intMap=new HashMap<Integer, Integer>();
		
		for(int i=0;i<=n-1;i++)
		{
			if(intMap.containsKey(a[i]))
			{
				int count=intMap.get(a[i]);
				count=count+1;
				intMap.put(a[i], count);
			}
			else
			{
				intMap.put(a[i], 1);
			}
			//System.out.println(i);
		}
		int max=0;
		for(Entry<Integer, Integer> ent:intMap.entrySet())
		{
			if(max<ent.getValue())
			{
				max=ent.getValue();
				freqNumber=ent.getKey();
			}
		}
		
		return freqNumber;
	}
	
	
	 public int solution2(int[] A) {
	        int freqnumber=0;
	        int max=0;
	        HashMap<Integer,Integer> intMap=new HashMap<Integer,Integer>();
	        for(int i=0;i<=A.length-1;i++)
	        {
	            if(intMap.containsKey(A[i]))
	            {
	                int count=intMap.get(A[i]);
	                count=count+1;
	                intMap.put(A[i],count);
	            }
	            else
	            {
	                intMap.put(A[i],1);    
	            }
	        }
	        for(Entry<Integer,Integer>ent:intMap.entrySet())
	        {
	            if(max<ent.getValue())
	            {
	                max=ent.getValue();
	                freqnumber=ent.getKey();
	            }
	            
	        }
	        
	        return freqnumber;
	    }

}
