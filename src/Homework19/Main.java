package Homework19;

public class Main {
    public static void main(String[] args) {
        Flat[] flat = {new Flat (4, "Kalykova 45")};
        Hotel[] hotel = {new Hotel(5, "Seitek 54")};
        Dormitory[] dermitory = {new Dormitory(3, "Kadyrova 89a")};

        System.out.print("Flat: ");
        for (Flat i: flat) {
            System.out.println(i);
            i.oplatasystem();
        }

        System.out.print("Hotel: ");
        for (Hotel i: hotel) {
            System.out.println(i);
            i.rentsystem();
        }

        System.out.print("Dermitory: ");
        for (Dormitory i: dermitory) {
            System.out.println(i);
            i.rentsystem();
        }
    }
}
