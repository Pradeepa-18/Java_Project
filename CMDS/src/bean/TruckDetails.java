package bean;
public class TruckDetails extends VehicleDetails {

    private double roadTax;

    public TruckDetails(int vehicleID, String vehicleName, int capacity, double roadTax) {
        super(vehicleID, vehicleName, capacity);
        this.roadTax = roadTax;
    }

    public TruckDetails() {
    }

    public double getRoadTax() {
        return roadTax;
    }

    public void setRoadTax(double roadTax) {
        this.roadTax = roadTax;
    }

    @Override
    public String toString() {
        return "TruckDetails{" +
                "roadTax=" + roadTax +
                ", vehicleID=" + vehicleID +
                ", vehicleName='" + vehicleName + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
