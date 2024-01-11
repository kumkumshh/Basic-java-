package patterns;

public class rotatedhalfpyramid {
    public static void main(String[] args) {
        
        //inverted half pyramid
        // rotated by 180 deg

        int n=4;

        for(int i=1; i<=n; i++){
            //for the spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //for the stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
    }
     }
        
}
