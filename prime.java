import java.util.Scanner;

public class prime {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int  div=2, flag=0;

        while(div<=n/2){
          if(n%div==0)
          {
          System.out.println(n+" is not Prime number");
          flag = 8;
          break;
          } 
          div=div+1;
        }

        if (flag == 0) System.out.println(n + " is Prime number");
        
        // 9/2==1 : 9 is prime
        // 9/3==0 : 9 is not prime
        // 9/4==1 : 9 is prime
          
        }
    }
    
