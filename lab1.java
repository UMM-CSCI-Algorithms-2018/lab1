// Vipul Sharma
// John Schonebaum

// Imports

import java.io.*;


public class lab1 
{
	
	// Method for factorial
	public static int factorial(int n)
    {
        if (n == 0)
          return 1;
         
        return (n*factorial(n-1));
    }
			
	// Display Combinations
	public static int display(int size)
	{
		int i;
		for (i=0; i<size; i++)
		{
			
		}
		return size;
		
	}
	// Main
	public static void main(String args[]) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		// Type declarations
		int n,size = 0, i;
		
		
		System.out.println("Enter a number");
		n = Integer.parseInt(in.readLine());
		
		// Combination: C(n,r) = (n)!*(n-r)!*(r)!
		
	}
}
