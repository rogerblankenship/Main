public class InitArray {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 10};


        System.out.printf("%s%8s%n", "Index", "Value");
        int counter = 0;




            for (counter = 0; counter < array.length; counter++) {
                if((array[counter]/2)%2 != 1){

                    array[counter] = array[counter ]*2;
                }
                System.out.printf("%5d%8d%n", counter, array[counter]);
            }//for
    }//main
}//end class
