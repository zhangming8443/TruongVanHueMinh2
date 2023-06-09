package case_study.model.facility;

public class Room extends Facility {
    private String serviceFree;

    public Room() {
    }

    public Room(String serviceCode, String serviceName, double area, int rentalCost, int maximumPeople, String rentalType, String serviceFree) {
        super(serviceCode, serviceName, area, rentalCost, maximumPeople, rentalType);
        this.serviceFree = serviceFree;
    }

    public String getServiceFree() {
        return serviceFree;
    }

    public void setServiceFree(String serviceFree) {
        this.serviceFree = serviceFree;
    }

    @Override
    public String toString() {
        return "ROOM: {"
                + super.toString()
                + " | Service free: " + serviceFree
                + "}";
    }
}
