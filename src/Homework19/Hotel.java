package Homework19;

public class Hotel extends Famaly implements Rent{

    public Hotel(int members, String address) {
        super(members, address);
    }

    @Override
    public void rentsystem() {
        System.out.println("Плотит за аренду 50.000 сом\n");
    }
}
