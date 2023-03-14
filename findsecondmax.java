/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class findsecondmax
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0){
		    
		    int n1=sc.nextInt();
		    int n2=sc.nextInt();
		    int n3=sc.nextInt();
		    
		    if((n1>n2 && n1<n3) || (n1<n2 && n1>n3)){
		        System.out.println(n1);
		    }
		    else if((n2>n1 && n2<n3)||(n2>n3 && n2<n1)){
		        System.out.println(n2);
		    }
		    else{
		        System.out.println(n3);
		    }
		}
		
		
		
		// your code goes here
	}
}
