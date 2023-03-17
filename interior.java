/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class interior
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0){
		    
		    int X1=sc.nextInt();
		    int Y1=sc.nextInt();
		    int X2=sc.nextInt();
		    int Y2=sc.nextInt();
		    
		    if((X1+Y1)<(X2+Y2)){
		        System.out.println(X1+Y1);
		    }
		    else{
		        System.out.println(X2+Y2);
		    }
		    
		}
		
		
		// your code goes here
	}
}
