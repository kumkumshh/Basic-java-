import java.util.*;

public class solidrect {
    public static void main(String[] args) {
        
        // solid rectangle 

        Scanner s1 = new Scanner(System.in);
        int n = s1.nextInt(); //for the row
        int m = s1.nextInt(); //for the column
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
