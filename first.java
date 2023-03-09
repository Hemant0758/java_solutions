import java.util.EnumSet;
import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        
        // u have to take input of two students called ram & shyam
        // and tell them who comes first

        // take marks of 5 subjects, compare  who comes
        // first in which subject & print marks along with
        // subject names using loop

        Scanner sc=new Scanner(System.in);
    
        System.out.println("Enter Marks of Ram: ");
        int Ram=sc.nextInt();

        System.out.println("Enter Marks of Shyam: ");
        int Shyam=sc.nextInt();


        System.out.println((Ram>Shyam?"Ram":"Shyam") +" gets "+ (Ram>Shyam?Ram:Shyam) +" comes first");

        // if(Ram>Shyam)
        // {
        // System.out.println("Ram gets " +Ram+", & comes First");
        // }
        // else{
        // System.out.println("Shyam gets " +Shyam +", & comes First");
        // }




        sc.close();
    }
}
