package cloudera;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class StringProblem5 {

	public static void main(String[] args) {
		String Test="aabbcccccccccgggtt";
		
		String[] compSet=new String[Test.length()]; 
		char[] origstring=Test.toCharArray();
		int j=0;
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<Test.length();i++)
		{
			if(i==0)
			{
				compSet[j]=origstring[i]+"1";
			}
			else if(origstring[i]!=origstring[i-1])
			{
				compSet[j]=Test.toCharArray()[i]+"1";
			}
			else if(origstring[i]==origstring[i-1])
			{
				char[] dup=compSet[j-1].toCharArray();
				char prev=dup[0];
				int num=(int)dup[1]-'0';
				num=num+1;
				compSet[j-1]=prev+Integer.toString(num);
				j--;
			}
			
			j++;
		}
		
		for(String s: compSet)
		{
			if(s!=null)
			sb.append(s);
			
		}
		
		if(sb.length()<Test.length())
		System.out.println(sb);
		else
			System.out.println(Test);
		

	}

}
