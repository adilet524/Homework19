package Homework19;

public class Dormitory extends Famaly implements Rent{

    public Dormitory(int members, String address) {
        super(members, address);
    }

    @Override
    public void rentsystem() {
        System.out.println("Плотит за аренду 5.000 сом\n");
    }



}
