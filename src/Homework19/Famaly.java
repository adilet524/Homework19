package Homework19;

public class Famaly {
    private int members;
    private String address;
    private Flat[] flats;
    private Hotel[] hotels;
    private Dormitory[] dormitories;


    public Famaly(int members, String address) {
        this.members = members;
        this.address = address;
    }

    public Famaly() {

    }

    public int getMembers() {
        return members;
    }

    public void setMembers(int members) {
        this.members = members;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Flat[] getFlats() {
        return flats;
    }

    public void setFlats(Flat[] flats) {
        this.flats = flats;
    }

    public Hotel[] getHotels() {
        return hotels;
    }

    public void setHotels(Hotel[] hotels) {
        this.hotels = hotels;
    }

    public Dormitory[] getDormitories() {
        return dormitories;
    }

    public void setDormitories(Dormitory[] dormitories) {
        this.dormitories = dormitories;
    }

    @Override
    public String toString() {
        return "Members = " + members + ", " +
                "Address = " + address + "";
    }
}
