package test;

import bean.ResidentVehicle;
import bean.VisitorVehicle;
import exception.ParkingSlotNotAvailableException;
import exception.VehicleNotFoundException;
import service.ParkingManagement;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Driver {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ParkingManagement pk = new ParkingManagement();
        ResidentVehicle rv;
        VisitorVehicle vv;
        int ch = 0;
        int ch2 = 0;
        do {
            System.out.println();
            System.out.println("1 ---> AddVehicle");
            System.out.println("2 ---> SetOutTime");
            System.out.println("3 ---> ResidentVehicleCount");
            System.out.println("4 ---> DisplayAllVehicles");
            System.out.println("5 --->Exit");

            System.out.println("Enter Your Choice: ");
            ch = Integer.valueOf(br.readLine());

            switch(ch)
            {
                case 1:
                    try {
                        do {
                            System.out.println("ADD VEHICLE");
                            System.out.println("1 ---> VisitorVehicle");
                            System.out.println("2 ---> Resident Vehicle");
                            System.out.println("3 ---> Exit");

                            System.out.println("Enter your choice: ");
                            ch2 = Integer.valueOf(br.readLine());
                            switch (ch2) {
                                case 1:
                                    System.out.println("Enter Owner Name: ");
                                    String name = br.readLine();
                                    System.out.println("Enter Vehicle Registration Number: ");
                                    String regnumber = br.readLine();
                                    System.out.println("Enter MobileNumber:");
                                    long mobnum = Long.valueOf(br.readLine());
                                    System.out.println("Enter Visiting FlatNumber : ");
                                    int visitflatNumber = Integer.valueOf(br.readLine());
                                    System.out.println("Enter the inTime: ");
                                    int intime = Integer.valueOf(br.readLine());
                                    vv = new VisitorVehicle(regnumber, name, mobnum, visitflatNumber, intime);
                                    System.out.println(pk.addVehicle(vv));
                                    break;
                                case 2:
                                    System.out.println("Enter Owner Name: ");
                                    name = br.readLine();
                                    System.out.println("Enter Vehicle Registration Number: ");
                                    regnumber = br.readLine();
                                    System.out.println("Enter MobileNumber:");
                                    mobnum = Long.valueOf(br.readLine());
                                    System.out.println("Enter FlatNumber: ");
                                    int flatnumber = Integer.valueOf(br.readLine());

                                    System.out.println("Enter the parking status (Parked / NotParked)");
                                    String s = br.readLine();
                                    boolean status;
                                    if (s.equalsIgnoreCase("Parked"))
                                        status = true;
                                    else
                                        status = false;
                                    rv = new ResidentVehicle(regnumber, name, mobnum, flatnumber, status);
                                    System.out.println(pk.addVehicle(rv));
                                    break;
                                case 3:
                                    System.out.println("Exit..");
                                    break;
                                default:
                                    System.out.println("Invalid Choice ");

                            }

                        } while (ch2 != 3);
                    }catch(ParkingSlotNotAvailableException pe)
                    {
                        System.out.println(pe.getMessage());
                    }
                    break;
                case 2:
                    try {
                        System.out.println("Enter the regnum");
                        String regnumber = br.readLine();
                        System.out.println("Enter the outTime: ");
                        int outTime = Integer.valueOf(br.readLine());
                        System.out.println(pk.setVisitorVehicleOutTime(regnumber, outTime));
                    }catch(VehicleNotFoundException ve)
                    {
                        System.out.println(ve.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("ResidentVehicle Count");
                    System.out.println(pk.getParkedResidentVehicleCount());
                    break;
                case 4:
                    System.out.println(" DisplayAllVehicles ");
                    pk.displayAllVehicles();
                    break;
                case 5:
                    System.out.println("--Thankyou--");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }

        }while(ch!=5);
        }

    }
