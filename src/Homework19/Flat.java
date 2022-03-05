package Homework19;

public class Flat extends Famaly implements KomUsluga{

    public Flat(int members, String address) {
        super(members, address);
    }

    @Override
    public void oplatasystem() {
        System.out.println("Плотит за аренду 25.000\n");
    }
}
