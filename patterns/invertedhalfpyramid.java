package patterns;

public class invertedhalfpyramid {
    public static void main(String[] args) {
        
        //inverted half pyramid

        int n=5;
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
