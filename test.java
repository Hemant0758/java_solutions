import java.io.ObjectInputFilter.Status;
import java.util.Scanner;

public class test {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();

        while(t>0){
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println((a>b?"a":"b")+ " is greatest number");
            t--;
        }
        
    }
}
