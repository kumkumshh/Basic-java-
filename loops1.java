
import java.util.*;

public class loops1{
    /**
     * @param args
     */
    public static void main(String[] args){

        //making a simple calculator with the help of switch statement 

        // 1: a+b;
        // 2: a-b;
        // 3: a*b;
        // 4: a/b;
        // 5: a%b;

        //taking input from the user
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int operator = sc.nextInt();

        //calculating 
        switch (operator) {
            case 1: System.out.println(a+b);
            break;
             case 2: System.out.println(a-b);
            break;
             case 3: System.out.println(a*b);
            break;
             case 4: System.out.println(a/b);
            break;
             case 5: System.out.println(a%b);
            break;
            default: System.out.println("Invalid operator");
        }      

}
}