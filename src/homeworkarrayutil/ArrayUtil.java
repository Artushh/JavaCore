package homeworkarrayutil;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {25, 21, 48, 57, 26, 35, 68, 98, 31, 29};
//tpel masivi bolor elementner@
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "/ ");

        }
//amena mec tive

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println();
        System.out.println("մեծ  " + max);
//tepl amena poqr tive
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];

            }

        }
        System.out.println("փոքր  " + min);

//mijin tvabanakan    u @ndhanur gumare
        int result = 0;
        int i;
        for (i = 0; i < array.length; i++) {

            result = result + array[i];


        }
        System.out.println("էլեմենտների գումարը =" + result);
        System.out.println("միջին թվաբանականը=" + result / array.length);

        System.out.println("զույգ էլեմենտներ");
        for (int j = 0; j < array.length; j++) {
            if (array[j] % 2 == 0) {
                System.out.println(array[j]);
            }
        }
        System.out.println("կենտ էլեմենտներ");
        for (int j = 0; j < array.length; j++) {
            if (array[j] % 2 != 0) {
                System.out.println(array[j]);
            }

        }
        System.out.println("զույգերի քանակը");
        int couplescount = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] % 2 == 0) {
                couplescount++;


            }
        }
        System.out.println(" couplescount= " + couplescount);
        System.out.println("կենտերի քանակը");
        int oddcount = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] % 2 != 0) {
                oddcount++;


            }
        }
        System.out.println("oddcount=" + oddcount);


    }
}






