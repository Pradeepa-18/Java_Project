package service;

import bean.ResidentVehicle;
import bean.Vehicle;
import bean.VisitorVehicle;
import exception.ParkingSlotNotAvailableException;
import exception.VehicleNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class ParkingManagement {
    List<Vehicle> allVehicle;

    public ParkingManagement()
    {
        allVehicle = new ArrayList<>();
    }
    public String addVehicle(Vehicle vehicle) throws ParkingSlotNotAvailableException
    {

        if(allVehicle.size() <=2) {
            allVehicle.add(vehicle);
            return "Vehicle parked at Parking Slot no : 2";
        }
        else
            throw new ParkingSlotNotAvailableException("No Parking Slots  Available");
    }
    public String setVisitorVehicleOutTime(String regNumber, int outTime) throws VehicleNotFoundException
    {
        for(Vehicle k:allVehicle) {
            if (k instanceof VisitorVehicle)
            {
                if (k.getRegNumber().equals(regNumber)) {
                    ((VisitorVehicle) k).setOutTime(outTime);
                    return "Vehicle with Reg Number : " + regNumber + " updated successfully";
                }
            }
        }

        throw new  VehicleNotFoundException ("Searched Vehicle Not Found");
    }

    public String getParkedResidentVehicleCount(){
        int count = 0;
        for(Vehicle k : allVehicle)
        {
            if(k instanceof ResidentVehicle)
            {
                if(((ResidentVehicle) k).isParkingStatus() == true){
                    count++;
                }
            }
        }
        return "Number of ResidentVehicle: "+ count;
    }
    public void displayAllVehicles()
    {
        for(Vehicle k:allVehicle)
            System.out.println("Name: "+k.getOwnerName()+"\n RegisterNumber: "+k.getRegNumber()+"\n MobileNumber: "+k.getMobileNumber()+"\n");
    }

    }

