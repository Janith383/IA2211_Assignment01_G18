package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Faculty artFaculty = new Faculty("Art", 10, 10, 10);
        Faculty managementFaculty = new Faculty("Management", 20, 20, 20);
        Faculty technologyFaculty = new Faculty("Technology", 30, 30, 30);

        Faculty[] faculties = {artFaculty, managementFaculty, technologyFaculty};

        while (true) {
            System.out.println("CAR PARK MANAGEMENT SYSTEM - University Of Colombo \n");
            System.out.println("1. Assign a Vehicle to Park");
            System.out.println("2. Unpark a Vehicle");
            System.out.println("3. Exit");

            System.out.println("Enter The Number to Choose The Parking Area.");
            Scanner scanner = new Scanner(System.in);
            int input1 = scanner.nextInt();

            switch (input1) {
                case 1:
                    System.out.println("\nPlease choose your faculty: ");
                    for (int i = 0; i < faculties.length; i++) {
                        System.out.println((i + 1) + ". " + faculties[i].getName());
                    }

                    while (true) {

                        int input2 = scanner.nextInt();

                        System.out.println("Please select the parking type : \n");
                        System.out.println("1. Standard");
                        System.out.println("2. Handicapped");
                        System.out.println("3. Long Vehicle");

                        int input3 = scanner.nextInt();
                        switch (input1) {
                            case 1:
                                System.out.println("Available parking slots: ");
                                ParkingSlot[] availableSlots = faculties[0].getStandard().availableSlots();
                                for (int i = 0; i < availableSlots.length; i++) {
                                    System.out.println(availableSlots[i].getId());
                                }
                                System.out.println("Do you wish to park (Y/N): ");
                                String wantPark = scanner.next();
                                if (wantPark.equalsIgnoreCase("y")) {
                                    while (true) {
                                        System.out.println("Please select a available parking slot from the above list: ");
                                        int slotID = scanner.nextInt();
                                        ParkingSlot slot = faculties[0].getHandicapped().getParkingSlot(slotID);
                                        if (slot != null) {
                                            if (slot.isAvailable() == true) {
                                                System.out.println("Please enter your faculty ID number: ");
                                                String facultyID = scanner.next();
                                                slot.setDriversID(facultyID);
                                                System.out.println("Please enter your mobile number: ");
                                                String mobile = scanner.next();
                                                slot.setMobile(mobile);
                                                faculties[0].getStandard().reserveSlot(slot);
                                                System.out.println("You can park your vehicle at the number " + slot.getId() + " slot");
                                            }
                                            break;
                                        }
                                        System.out.println("Sorry. Something went wrong. Please try again");
                                        continue;
                                    }
                                    break;

                                } else {
                                    System.out.println("Thank you. Come again");
                                }
                                break;

                            case 2:
                                //fdf
                                break;


                            case 3:

                                break;
                            default:
                                System.out.println("Invalid input. Please enter your faculty again: ");
                                continue;
                        }
                        break;

                    }
                    break;


            }
        }
    }
}
