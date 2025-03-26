package main.controller;

import main.model.Car;
import main.model.Customer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class ControllerTestTwo {
    // Assertion Case 6: Test releasing a car from rent
    @Test
    public void testReleaseCarFromRent() {
        Controller controller = new Controller();
        controller.addNewCar("Tesla Model 3", "Tesla", "EFG123", 70, 60000, "Silver");
        controller.addNewCustomer("Bob Johnson", 35, "DL555555", "5555555555");
        Customer customer = controller.findCustomer("DL555555");
        Car car = controller.findCar("EFG123");
        controller.bindCarToCustomer(customer, car);
        controller.releaseCarFromRent("EFG123");
        Assertions.assertTrue(controller.availableCars.contains(car));
    }

    // Assertion Case 7: Test removing a customer from the system
    @Test
    public void testRemoveCustomer() {
        Controller controller = new Controller();
        controller.addNewCustomer("Emily Davis", 28, "DL777777", "7777777777");
        Customer removedCustomer = controller.removeCustomer("DL777777");
        Assertions.assertNotNull(removedCustomer);
    }

    // Assertion Case 8: Test modifying a car's details
    @Test
    public void testModifyCarDetails() {
        Controller controller = new Controller();
        controller.addNewCar("Nissan Altima", "Nissan", "STU456", 55, 28000, "Gray");
        ByteArrayInputStream in = new ByteArrayInputStream("1\n".getBytes());
        System.setIn(in);
        controller.modifyCarDetails("STU456");
        Car modifiedCar = controller.findCar("STU456");
        Assertions.assertNotNull(modifiedCar);
    }


    // Assertion Case 9: Test renting cars to a customer
    @Test
    public void testRentCars() {
        Controller controller = new Controller();
        controller.addNewCar("Kia Sportage", "Kia", "VWX789", 50, 30000, "Green");
        controller.addNewCustomer("Michael Wilson", 40, "DL111111", "1111111111");
        Scanner scanner = new Scanner("DL111111\n1\n3");
        controller.rentCars(scanner);
        Assertions.assertEquals(1, controller.rentedCars.size());
    }

    // Assertion Case 10: Test checking if a given license number belongs to a customer
    @Test
    public void testCheckIfCustomer() {
        Controller controller = new Controller();
        controller.addNewCustomer("Sarah Brown", 33, "DL222222", "2222222222");
        boolean isCustomer = controller.checkIfCustomer("DL222222");
        Assertions.assertTrue(isCustomer);
    }
    public void testCheckIfNoCustomer() {
        Controller controller = new Controller();
        controller.addNewCustomer("Sarah Brown", 33, "DL222222", "2222222222");
        boolean isCustomer = controller.checkIfCustomer("DL222222");
        Assertions.assertFalse(isCustomer);
    }
    @Test
    public void testNoCarsInitially() {
        Controller controller = new Controller();
        controller.displayAvailableCars();
        // Assuming the method prints "There are no cars/No cars available" when there are no cars
        String expectedMessage = "There are no cars/No cars available";
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        controller.displayAvailableCars();
        String actualOutput = outputStream.toString().trim();
        Assertions.assertEquals(expectedMessage, actualOutput);    }

}


