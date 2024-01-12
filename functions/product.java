package functions;

import java.util.Scanner;

public class product {

    public static int product(int a, int b){
        return a*b;
    }
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        int result = product(a,b);
        System.out.println(result);
        }
}
