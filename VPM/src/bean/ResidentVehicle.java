package bean;

public class ResidentVehicle extends Vehicle {
    private int flatNumber;
    private boolean parkingStatus;

    public ResidentVehicle(String regNumber, String ownerName, Long mobilenumber, int flatNumber, boolean parkingStatus) {
        super(regNumber, ownerName, mobilenumber);
        this.flatNumber = flatNumber;
        this.parkingStatus = parkingStatus;

    }

    public int getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(int flatNumber) {
        this.flatNumber = flatNumber;
    }

    public boolean isParkingStatus() {
        return parkingStatus;
    }

    public void setParkingStatus(boolean parkingStatus) {
        this.parkingStatus = parkingStatus;
    }

    @Override
    public String toString() {
        return "ResidentVehicle{" +
                "flatNumber=" + flatNumber +
                ", parkingStatus=" + parkingStatus +
                ", regNumber='" + regNumber + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", mobileNumber=" + mobileNumber +
                '}';
    }
}
