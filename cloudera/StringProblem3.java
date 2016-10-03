package cloudera;

import java.io.Console;

public class StringProblem3 {

	public static void main(String[] args) {
		String sample="Mr John Smith ";
		char[] StrSample=sample.toCharArray();
		int len=0;
		System.out.println(StrSample.length);
		for(int i=0;i<StrSample.length;i++)
		{
			if(StrSample[i]==' ')
			{
				len++;
			}
		}
		System.out.println(len);
		
		char[] finalString=new char[StrSample.length+len];
		int j=0;
		for(int i=0;i<StrSample.length;i++)
		{
			if(StrSample[i]==' ' && i!=StrSample.length-1)
			{
				finalString[j]='%';
				finalString[j+1]='2';	
				finalString[j+2]='0';
				j=j+2;
			}
			else if(i!=StrSample.length-1)
			{
				finalString[j]=StrSample[i];
			}
			j++;
		}
		String output=String.valueOf(finalString);
		
		System.out.println(output);
		System.out.println(output.length());

	}

}
 