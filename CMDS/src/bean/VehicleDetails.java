package bean;

import java.util.ArrayList;
import java.util.List;

public class VehicleDetails {
    protected int vehicleID;
    protected String vehicleName;
    protected int capacity;
    private List<PackageDetails> pd = new ArrayList<>();

    public VehicleDetails(int vehicleID, String vehicleName, int capacity)
    {
        this.vehicleID = vehicleID;
        this.vehicleName = vehicleName;
        this.capacity = capacity;
    }

    public VehicleDetails() {
    }

    public void addPackage(PackageDetails p)
    {
        pd.add(p);
    }

    public int getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(int vehicleID) {
        this.vehicleID = vehicleID;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<PackageDetails> getPd() {
        return pd;
    }

    public void setPd(List<PackageDetails> pd) {
        this.pd = pd;
    }

    @Override
    public String toString() {
        return "VehicleDetails{" +
                "vehicleID=" + vehicleID +
                ", vehicleName='" + vehicleName + '\'' +
                ", capacity=" + capacity +
                ", pd=" + pd +
                '}';
    }
}

