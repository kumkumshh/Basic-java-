package functions;

public class tableFun {
    public static void table(int n){

        for(int i=1; i<=10; i++){
            System.out.println(n*i);
        }        
    }

    public static void main(String[] args) {
        table(8);
    }
}
