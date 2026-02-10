package bean;

public class AirCargoDetails extends VehicleDetails{
    private double airForce;
    public AirCargoDetails(int vehicleID,String vehicleName, int capacity,double airForce)
    {
        super(vehicleID,vehicleName,capacity);
        this.airForce=airForce;
    }

    public AirCargoDetails() {
    }

    public double getAirForce() {
        return airForce;
    }

    public void setAirForce(double airForce) {
        this.airForce = airForce;
    }

    @Override
    public String toString() {
        return "AirCargoDetails{" +
                "airForce=" + airForce +
                ", vehicleID=" + vehicleID +
                ", vehicleName='" + vehicleName + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
