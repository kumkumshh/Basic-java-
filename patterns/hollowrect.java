package patterns;

public class hollowRect {
    public static void main(String[] args) {
        
        //hollow rectangle
        int n=6;
        int m=5;
        //outer loop row ----->
        for(int i=1; i<=n; i++){
            //inner loop column
            for(int j=1; j<=m; j++){
                if (i == 1 || i == n || j == 1 || j == m) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
