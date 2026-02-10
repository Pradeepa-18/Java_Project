package test;

import bean.AirCargoDetails;
import bean.PackageDetails;
import bean.TruckDetails;
import bean.VehicleDetails;
import exception.InvalidVehicleException;
import exception.VehicleCapacityAlreadyExceededException;
import service.CargoManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        List<VehicleDetails> vk = new ArrayList<>();
        List<PackageDetails> pk = new ArrayList<>();
        VehicleDetails v1 = new TruckDetails(101,"Truck-1",3,80);
        VehicleDetails v2 = new TruckDetails(102,"Truck-2",5,80);
        VehicleDetails v3 = new AirCargoDetails(103,"AirCargo-1",5,100);
        VehicleDetails v4 = new AirCargoDetails(104,"AirCargo-2",5,100);
        CargoManagementSystem cms = new CargoManagementSystem();
        vk.add(v1);
        vk.add(v2);
        vk.add(v3);
        vk.add(v4);
        cms.setVd(vk);
        PackageDetails p1 = new PackageDetails(1,"Undelivered");
        PackageDetails p2 = new PackageDetails(2,"Undelivered");
        PackageDetails p3 = new PackageDetails(3,"Undelivered");
        PackageDetails p4 = new PackageDetails(4,"Undelivered");
        PackageDetails p5 = new PackageDetails(5,"Undelivered");
        v1.addPackage(p1);
        v2.addPackage(p2);
        v1.addPackage(p3);
        v1.addPackage(p4);
        v1.addPackage(p5);
        pk.add(p3);
        pk.add(p5);
        pk.add(p1);
        pk.add(p4);
        pk.add(p2);
        cms.setPd(pk);

        try {
            cms.addPackageToVehicle(p1,101);
            cms.addPackageToVehicle(p2,102);
            cms.addPackageToVehicle(p4,103);
        }
        catch (InvalidVehicleException ie)
        {
            System.out.println(ie);
        }
        catch(VehicleCapacityAlreadyExceededException ve)
        {
            System.out.println(ve);

        }
        System.out.println(cms.fetchPackage(2));

        cms.deliverPackage(3);
        cms.deliverPackage(2);
        System.out.println(cms.deliveryPendingPackages());
        System.out.println(cms.fetchUndeliveredPackages());
        for(VehicleDetails v:cms.getVd())
        {
            System.out.println(v);
        }
        for(PackageDetails p:cms.getPd())
        {
            System.out.println(p);
        }



    }
}
