package course_3_oop;

public class Address {
    String streetNumber;
    private int apartmentNumber;
    String location;

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(int newApartmentNumber) {
        apartmentNumber = newApartmentNumber;
    }
}
