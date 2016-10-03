package cloudera;

public class StringProblem5OrignalSolution {

	public static void main(String[] args) {
		String orignalStrin="aaaabbbbbdddcccccaaa";
		String newString="";
		int count=1;
		char last=orignalStrin.toCharArray()[0];
		for(int i=0;i<orignalStrin.length();i++)
		{
			if(i!=0&&orignalStrin.toCharArray()[i]==orignalStrin.toCharArray()[i-1])
			{
				++count;
				newString=newString.substring(0, newString.length()-2);
				newString=newString+last+Integer.toString(count);
			}
			else
			{
				count=1;
				newString=newString+orignalStrin.toCharArray()[i]+Integer.toString(count);
				last=orignalStrin.toCharArray()[i];
				count=1;
			}
		}
		
		System.out.println(newString);

	}

}
