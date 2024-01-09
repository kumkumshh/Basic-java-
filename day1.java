
import java.util.*;

public class day1{
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



         // Question 2
        // Displaying the name of the month acc to the num 1 to 12

         Scanner sc = new Scanner(System.in);
          int month = sc.nextInt();

          //calculating 
          switch (month) {
              case 1: System.out.println("January");
              break;
                case 2: System.out.println("February");
              break;
                case 3: System.out.println("March");
              break;
                case 4: System.out.println("April");
              break;
                case 5: System.out.println("May");
              break;
                case 6: System.out.println("June");
              break;
                case 7: System.out.println("July");
              break;
                case 8: System.out.println("August");
              break;
                case 9: System.out.println("September");
              break;
                case 10: System.out.println("October");
              break;
              case 11: System.out.println("November");
              break;
                case 12: System.out.println("December");
              break;
              default: System.out.println("Invalid number");
          }     


      //Question no 3 
      //print all the even numbers till n
      
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      for(int i=2; i<=n; i++){
        if(i%2==0){
          System.out.print(i);
        }else{
           System.out.println("");
        } 

      }


      //question no 4
      // running the loop 

      // for( ; ; ) {
      //   System.out.println("kumkum sharma");

      // }

      
      

}
}