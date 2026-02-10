package utility;

import bean.PackageDetails;
import bean.VehicleDetails;
import exception.InvalidVehicleException;
import exception.VehicleCapacityAlreadyExceededException;

import java.util.HashMap;
import java.util.List;

public interface ManageCargoInterface {
    void addPackageToVehicle(PackageDetails pd,int vehicleId ) throws InvalidVehicleException, VehicleCapacityAlreadyExceededException;
    VehicleDetails fetchPackage(int packageID);
    void deliverPackage(int packageID);
    List<PackageDetails> deliveryPendingPackages();
    HashMap<Integer, Integer> fetchUndeliveredPackages();
}
