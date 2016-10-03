import java.util.ArrayList;


public class palindrom {

	public static void main(String[] args) {
		String[] input1={"Bharti","Bsd","Ajkh","Bhav","Brij","Chetak","Arvi","Bhav"};
		System.out.println(PalindromeLengthPuzzle(input1));

	}
	
	public static int PalindromeLengthPuzzle(String[] input1)
    {
		String palString="";
		int paliLength=0;
       for(int i=0;i<=input1.length-1;i++)
       {
    	   String[] studentName=input1[i].split("");
    	   palString=palString+studentName[1];    	   
       }
       
       for(int i=2;i<=palString.length()-1;i++)
       {
    	   
    	  String newstring= palString.substring(0,i+1);
    	  if(checkpalindrom(newstring))
    	  {
    		  paliLength=newstring.length();
    	  }
    	  
       }
       
		return paliLength;
    }
	public static boolean checkpalindrom(String param)
	{
		char[] chararry=param.toCharArray();
		int reverseCounter=chararry.length-1;
		for(int i=0;i<chararry.length;i++)
		{
			if(i<=reverseCounter)
			{
			if(chararry[i]!=chararry[reverseCounter])
			{
				return false;
			}
			reverseCounter--;
			}
			
			
			
			
		}
		
		 
		return true;
	}


}
