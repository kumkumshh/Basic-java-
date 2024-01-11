import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        
        //Print if a number n is prime or not (Input n from the user). 
        Scanner scc = new Scanner(System.in);
        int n = scc.nextInt();

        boolean isPrime = true;
        for (int i=2; i<=n/2; i++){
            if (n%i==0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            if (n==1) {
                System.out.println("This is neither prime nor composite");
            }else{
                System.out.println("This is a prime number");
            }
        }else{
            System.out.println("This is not a prime number");
        }
        
    }
}
