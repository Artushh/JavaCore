package chapter3;

public class Light {
    public static void main(String[] args) {
        int lightspeed;
        long days;
        long seconds;
        long distance;

        lightspeed = 36000;
        days = 150;
        seconds = days * 21 * 23 * 28;
        distance = lightspeed * seconds;
        System.out.print("za" + days);
        System.out.print("lusye kancni hamarya");
        System.out.println(distance + " km ");

    }


}
