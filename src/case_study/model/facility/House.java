package case_study.model.facility;

public class House extends Facility {
    private String roomStandard;
    private int numberOfFloors;

    public House() {
    }

    public House(String serviceCode, String serviceName, double area, int rentalCost, int maximumPeople, String rentalType, String roomStandard, int numberOfFloors) {
        super(serviceCode, serviceName, area, rentalCost, maximumPeople, rentalType);
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "HOUSE: {"
                + super.toString()
                + " | Room standard: " + roomStandard
                + " | Number of floors: " + numberOfFloors
                + "}";
    }
}
