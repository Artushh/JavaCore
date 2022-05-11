package chapter3;

public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 265;
        double d = 320.456;
        System.out.println(" int v byte");
        b = (byte) i;
        System.out.println("i u b"  + i +  "  " + b);
        System.out.println("double   v   int");
        i = (int) d;
        System.out.println("d u i" + d + "  " + i);
        System.out.println("double v byte");
        b = (byte) d;
        System.out.println("d  u  b " + d +  "  " + i);
    }


}