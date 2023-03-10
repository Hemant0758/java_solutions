/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0){
		   
		   int X=sc.nextInt();
		   
		  if(X>70 && X<=100){
		       System.out.println("500");
		       
		   }
		   else if(X>100){
		       System.out.println("2000");
		   }
		   else{
		       System.out.println("0");
		   }
		}
		
		
		// your code goes here
	}
}
