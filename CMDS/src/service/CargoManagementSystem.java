package service;

import bean.PackageDetails;
import bean.VehicleDetails;
import exception.InvalidVehicleException;
import exception.VehicleCapacityAlreadyExceededException;
import utility.ManageCargoInterface;

import java.util.*;

public class CargoManagementSystem implements ManageCargoInterface {
    private List<PackageDetails> pd;
    private List<VehicleDetails> vd;
    private VehicleDetails vehicle;

    public CargoManagementSystem() {
        pd = new ArrayList<>();
        vd = new ArrayList<>();
    }

    public List<PackageDetails> getPd() {
        return pd;
    }

    public void setPd(List<PackageDetails> pd) {
        this.pd = pd;
    }

    public List<VehicleDetails> getVd() {
        return vd;
    }

    public void setVd(List<VehicleDetails> vd) {
        this.vd = vd;
    }

    public void addPackageToVehicle(PackageDetails p, int vehicleId) throws InvalidVehicleException, VehicleCapacityAlreadyExceededException {
        boolean flag = false;

        for (VehicleDetails v : vd) {
            if (v.getVehicleID() == vehicleId) {
                flag = true;
                if (v.getPd().size() > v.getCapacity())
                    throw new VehicleCapacityAlreadyExceededException("VehicleCapacityExceededException");
                for (PackageDetails i : v.getPd()) {
                    System.out.println("Package Details Updated");
                    i.setStatus("Undelivered");
                }
            }
        }

        pd.add(p);
        if (flag == false)
            throw new InvalidVehicleException("The Given VehicleId is not Present");
    }

    public VehicleDetails fetchPackage(int packageID) {
        for (VehicleDetails v : vd) {
            for (PackageDetails p : v.getPd()) {
                if (p.getPackageId() == packageID) {
                    return v;
                }
            }
        }
        return null;
    }

    public void deliverPackage(int packageID) {
        for (VehicleDetails v : vd) {
            for (PackageDetails p : v.getPd()) {
                if (p.getPackageId() == packageID)
                    if (p.getStatus().equals("Undelivered")) {
                        p.setStatus("Delivered");
                        System.out.println("Package " + p.getPackageId() + " Delivered");
                    }
            }
        }
    }

    public List<PackageDetails> deliveryPendingPackages() {
        List<PackageDetails> pp = new ArrayList<>();
        for (VehicleDetails v : vd) {
            for (PackageDetails p : v.getPd()) {
                if (p.getStatus().equals("Undelivered"))
                    pp.add(p);
            }

        }

        return pp;
    }

    public HashMap<Integer, Integer> fetchUndeliveredPackages() {
        HashMap<Integer, Integer> hp = new HashMap<>();
        int count = 0;
        for (VehicleDetails v : vd) {
            for (PackageDetails p : v.getPd()) {
                if (p.getStatus().equals("Undelivered")) {
                    count++;
                }

            }
            hp.put(v.getVehicleID(), count);
            count = 0;
        }
        return hp;
    }
}


    /*public HashMap<Integer, Integer> fetchUndeliveredPackages()
    {
        HashMap<Integer,Integer> hp = new HashMap<>();
        for (VehicleDetails v : vd) {
            for (PackageDetails p : v.getPd()) {
                if (p.getStatus().equals("Undelivered"))
                {
                    hp.put(v.getVehicleID(),hp.getOrDefault(v.getVehicleID(),0)+1);

                }

            }
        }
        return hp;
    }

}*/
