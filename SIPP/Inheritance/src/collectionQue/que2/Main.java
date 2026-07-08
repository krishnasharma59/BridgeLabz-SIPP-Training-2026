package collectionQue.que2;

import java.util.*;

public class Main {

    static ArrayList<String> parking = new ArrayList<>();

    // Adding vehicle
    static void enterVehicle(String vehicleNo) {
        if (parking.contains(vehicleNo)) {
            System.out.println("Vehicle is already parked.");
        } else {
            parking.add(vehicleNo);
            System.out.println(vehicleNo + " entered the parking.");
        }
    }

    // Removing vehicle
    static void exitVehicle(String vehicleNo) {
        if (parking.remove(vehicleNo)) {
            System.out.println(vehicleNo + " exited the parking.");
        } else {
            System.out.println("Vehicle not found.");
        }
    }

    // Searching vehicle
    static void searchVehicle(String vehicleNo) {
        if (parking.contains(vehicleNo)) {
            System.out.println(vehicleNo + " is currently parked.");
        } else {
            System.out.println(vehicleNo + " is not parked.");
        }
    }

    // Printing all vehicles
    static void displayVehicles() {
        System.out.println("\nVehicles Currently Parked:");

        if (parking.isEmpty()) {
            System.out.println("Parking is empty.");
        } else {
            for (String vehicle : parking) {
                System.out.println(vehicle);
            }
        }

        System.out.println("Total Occupied Slots: " + parking.size());
    }

    public static void main(String[] args) {

        enterVehicle("UP80AB1234");
        enterVehicle("DL01CD5678");
        enterVehicle("HR26EF9012");

        System.out.println();

        searchVehicle("DL01CD5678");
        searchVehicle("UP32XY1111");

        System.out.println();

        exitVehicle("DL01CD5678");

        displayVehicles();
    }
}
