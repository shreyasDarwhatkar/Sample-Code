package dynammicProgramming;

public class BinomialCoefficient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n = 5, k = 2;
		    System.out.println("Value of C("+n+","+k+") is "+binomialCoeff(n, k));
	}
	
	
	static int binomialCoeff(int n, int k)
    {
    int C[][] = new int[n+1][k+1];
    int i, j;
    
    // Calculate  value of Binomial Coefficient in bottom up manner
for (i = 0; i <= n; i++)
{
    for (j = 0; j <= min(i, k); j++)
    {
        // Base Cases
        if (j == 0 || j == i)
            C[i][j] = 1;
  
        // Calculate value using previosly stored values
        else
            C[i][j] = C[i-1][j-1] + C[i-1][j];
      }
 }
  
return C[n][k];
    }
	static int min(int a, int b)
    {
    return (a<b)? a: b; 
    }
 

}
