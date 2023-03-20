

public class TabularOutput {
    public static void main(String[] args){
        System.out.printf("%-10s%-10s%-10s%-10s", "N", "10*N", "100*N", "1000*n");
        System.out.println();



        for(int n =1; n<= 5; n++){
            System.out.printf("%-10d%-10d%-10d%-10d%n", n , (10*n), 100*n, 1000*n);
        }

    }

}
