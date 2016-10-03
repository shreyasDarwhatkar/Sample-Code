import java.util.ArrayList;


public class MediaOceanTest {

	public static void main(String[] args) {
		System.out.println(validtrianglesum("5#9#6#4#6#8"));

	}
	
	 public static String validtrianglesum(String input1)
	    {
		 String[] numberArray=input1.split("#");
		 ArrayList<Integer> stagesList=new ArrayList<Integer>();
		 int sum=0;
		 int max=0;
		 int stage=1;
		 int max_stages=0;
		 String Output="";
		 int stagesum=0;
		 int innerCount=0;
		 for(int k=1;stagesum<=numberArray.length;k++)
		 {
			 stagesum=stagesum+k;
			 
			 stagesList.add(stagesum);			 
		 }
		  
		 if (stagesList.contains(numberArray.length)) {
			for (int i = 0; i < stagesList.size() - 1; i++) {
				max = 0;
				if (stage == 1) {
					sum = sum + Integer.parseInt(numberArray[i]);
					innerCount = innerCount + 1;
				} else {

					for (int j = 0; j < stage; j++) {

						if (Integer.parseInt(numberArray[innerCount]) > max) {
							max = Integer.parseInt(numberArray[innerCount]);
							System.out.println("Max is" + max);
						}
						innerCount = innerCount + 1;
					}
					//sum=sum+max;
				}
				sum = sum + max;
				stage = stage + 1;
			}
		
		Output=""+sum;
		 }
		 else{
			 Output="Invalid";
		 }
		     return Output;
	
	    }

}
