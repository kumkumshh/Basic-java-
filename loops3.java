import java.util.Scanner;

public class loops3 {

    public static void main(String[] args) {

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
    }
}
