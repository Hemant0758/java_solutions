import java.util.Scanner;

public class starprint1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows/columns: ");
        int n=sc.nextInt();

        for (int i=1; i<=n;i++){
            System.out.print('*');

            for (int j=2; j<n;j++){
                if (i==1 || i==n) System.out.print('*');
                else System.out.print(" ");
            }

            System.out.print('*');
            System.out.println();
        }
    }
}
