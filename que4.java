import java.util.Scanner;

import java.util.*;

public class que4 {
    public static void main(String[] args) {
            

        //que 1
        //Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
        // If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
        // If they enter 0 then stop.
        // If he/ she scores :
        // Marks >=90 -> print “This is Good”
        // 89 >= Marks >= 60 -> print “This is also Good”
        // 59 >= Marks >= 0 -> print “This is Good as well”
        // Because marks don’t matter but our effort does.

        Scanner sc = new Scanner(System.in);
        int input;

        do{
            int marks = sc.nextInt();
            if(marks>=90 && marks<=100){
                System.out.println("This is good");
            }else if(marks>=60 && marks<=89){
                System.out.println("This is also good");
            }else if(marks>=0 && marks<=59){
                System.out.println("This is good as well");
            }else{
                System.out.println("Invalid input");
            }

            System.out.println("wants to continue ? (yes(1) or no(0))");
            input = sc.nextInt();
        }
        while(input==1);

    }
}
