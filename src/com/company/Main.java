package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Faculty artFaculty = new Faculty("Art", 10, 10, 10);
        Faculty managementFaculty = new Faculty("Management", 20, 20, 20);
        Faculty medicineFaculty = new Faculty("Medicine", 30, 30, 30);
        Faculty technologyFaculty = new Faculty("Technology", 30, 30, 30);

        Faculty[] faculties = {artFaculty, managementFaculty, technologyFaculty,medicineFaculty};

        boolean isOn = true;
        while (isOn) {
            System.out.println("CAR PARK MANAGEMENT SYSTEM - University Of Colombo \n");
            System.out.println("1. Assign a Vehicle to Park");
            System.out.println("2. Unpark a Vehicle");
            System.out.println("3. Parked vehicles list");
            System.out.println("4. Exit");

            System.out.println("Select an option from the above list: ");
            Scanner scanner = new Scanner(System.in);
            int input1 = scanner.nextInt();

            switch (input1) {
                case 1:
                    System.out.println("\nPlease choose your faculty: ");
                    for (int  i = 0; i< faculties.length; i++) {
                        System.out.println((i+1) + ". " + faculties[i].getName());
                    }

                    while (true) {

                        int input2 = scanner.nextInt();

                        if ((input2 > 0) && (input2 <= faculties.length)) {

                            System.out.println("Please the parking type you wish from the following list: \n");
                            System.out.println("1. Standard");
                            System.out.println("2. Handicapped");
                            System.out.println("3. Long Vehicle");

                            int input3 = scanner.nextInt();

                            ParkingSlot[] availableSlots = null;
                            String wantPark = null;

                            switch (input3) {
                                case 1:
                                    System.out.println("Available parking slots: ");
                                    availableSlots = faculties[(input2 - 1)].getStandard().availableSlots();
                                    for (int i=0; i< availableSlots.length; i++) {
                                        System.out.println(availableSlots[i].getId());
                                    }
                                    System.out.println("Do you wish to park (Y/N): ");
                                    wantPark = scanner.next();
                                    if (wantPark.equalsIgnoreCase("y")) {
                                        while (true) {
                                            System.out.println("Please select a available parking slot from the above list: ");
                                            int slotID = scanner.nextInt();
                                            ParkingSlot slot = faculties[(input2 - 1)].getStandard().getParkingSlot(slotID);
                                            if (slot != null) {
                                                if (slot.isAvailable() == true) {
                                                    System.out.println("Please enter your faculty ID number: ");
                                                    String facultyID = scanner.next();
                                                    slot.setDriversID(facultyID);
                                                    System.out.println("Please enter your mobile number: ");
                                                    String mobile = scanner.next();
                                                    slot.setMobile(mobile);
                                                    faculties[(input2 - 1)].getStandard().reserveSlot(slot);
                                                    System.out.println("You can park your vehicle at the number " + slot.getId() + " slot");
                                                } else {
                                                    System.out.println("Sorry. Something went wrong. Please try again");
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
                                    System.out.println("Available parking slots: ");
                                    availableSlots = faculties[(input2 - 1)].getHandicapped().availableSlots();
                                    for (int i=0; i< availableSlots.length; i++) {
                                        System.out.println(availableSlots[i].getId());
                                    }
                                    System.out.println("Do you wish to park (Y/N): ");
                                    wantPark = scanner.next();
                                    if (wantPark.equalsIgnoreCase("y")) {
                                        while (true) {
                                            System.out.println("Please select a available parking slot from the above list: ");
                                            int slotID = scanner.nextInt();
                                            ParkingSlot slot = faculties[(input2 - 1)].getHandicapped().getParkingSlot(slotID);
                                            if (slot != null) {
                                                if (slot.isAvailable() == true) {
                                                    System.out.println("Please enter your faculty ID number: ");
                                                    String facultyID = scanner.next();
                                                    slot.setDriversID(facultyID);
                                                    System.out.println("Please enter your mobile number: ");
                                                    String mobile = scanner.next();
                                                    slot.setMobile(mobile);
                                                    faculties[(input2 - 1)].getHandicapped().reserveSlot(slot);
                                                    System.out.println("You can park your vehicle at the number " + slot.getId() + " slot");
                                                } else {
                                                    System.out.println("Sorry. Something went wrong. Please try again");
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

                                case 3 :

                                    System.out.println("Available parking slots: ");
                                    availableSlots = faculties[(input2 - 1)].getLongVehicle().availableSlots();
                                    for (int i=0; i< availableSlots.length; i++) {
                                        System.out.println(availableSlots[i].getId());
                                    }
                                    System.out.println("Do you wish to park (Y/N): ");
                                    wantPark = scanner.next();
                                    if (wantPark.equalsIgnoreCase("y")) {
                                        while (true) {
                                            System.out.println("Please select a available parking slot from the above list: ");
                                            int slotID = scanner.nextInt();
                                            ParkingSlot slot = faculties[(input2 - 1)].getLongVehicle().getParkingSlot(slotID);
                                            if (slot != null) {
                                                if (slot.isAvailable() == true) {
                                                    System.out.println("Please enter your faculty ID number: ");
                                                    String facultyID = scanner.next();
                                                    slot.setDriversID(facultyID);
                                                    System.out.println("Please enter your mobile number: ");
                                                    String mobile = scanner.next();
                                                    slot.setMobile(mobile);
                                                    faculties[(input2 - 1)].getLongVehicle().reserveSlot(slot);
                                                    System.out.println("You can park your vehicle at the number " + slot.getId() + " slot");
                                                } else {
                                                    System.out.println("Sorry. Something went wrong. Please try again");
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

                                default:
                                    System.out.println("Invalid input. Please try again");

                            }
                            break;

                        }

                    }
                    break;

                case 2:
                    //code
                    break;

                case 3:
                    //code
                    break;

                case 4:
                    System.out.println("Have a good day. Bye");
                    isOn = false;
                    break;

                default:
                    System.out.println("Invalid input");
                    break;

            }

        }

    }
}
