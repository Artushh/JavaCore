package homeworkarrayutil;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {25, 21, 48, 57, 26, 35, 68, 98, 31, 29};
//tpel masivi bolor elementner@
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "/ ");

        }
//amena mec tive

        int y = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > y) {
                y = array[i];
            }
        }
        System.out.println();
        System.out.println("mec  " + y);
//tepl amena poqr tive
        int x = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < x) {
                x = array[i];

            }

        }
        System.out.println("poqr  " + x);

//mijin tvabanakan    u @ndhanur gumare
        int result = 0;
        int i;
        for (i = 0; i < array.length; i++) {

            result = result + array[i];


        }
        System.out.println("gumare =" + result);
        System.out.println("tvabanakan=" + result / 9);

        System.out.println("zuyg elementner");
        for (int j = 0; j < array.length; j++) {
            if (array[j] % 2 == 0) {
                System.out.println(array[j]);
            }
        }
        System.out.println("kent elementner");
        for (int j = 0; j < array.length; j++) {
            if (array[j] % 2 != 0) {
                System.out.println(array[j]);
            }

        }
        System.out.println("zuygeri qanak@");
        int main = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] % 2 == 0) {
                main++;


            }
        }
        System.out.println(" main= " + main);
        System.out.println("kenteri qanak@");
        int bit = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] % 2 != 0) {
                bit++;


            }
        }
        System.out.println("bit=" + bit);


    }
}






