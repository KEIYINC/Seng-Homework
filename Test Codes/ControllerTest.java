package main.controller;

import main.controller.Controller;
import main.model.Car;
import main.model.Customer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class ControllerTest {

    // Assertion Case 1: Test adding a new car to the system
    @Test
    public void testAddNewCar() {
        Controller controller = new Controller();
        controller.addNewCar("Toyota Camry", "Toyota", "ABC123", 50, 20000, "Blue");
        Assertions.assertEquals(1, controller.availableCars.size());
    }

    // Assertion Case 2: Test adding a new customer to the system
    @Test
    public void testAddNewCustomer() {
        Controller controller = new Controller();
        controller.addNewCustomer("John Doe", 30, "DL123456", "1234567890");
        Assertions.assertEquals(1, controller.allCustomers.size());
    }

    // Assertion Case 3: Test finding a car by license plate number
    @Test
    public void testFindCar() {
        Controller controller = new Controller();
        controller.addNewCar("Honda Civic", "Honda", "XYZ789", 40, 18000, "Red");
        Car foundCar = controller.findCar("XYZ789");
        Assertions.assertNotNull(foundCar);
    }

    // Assertion Case 4: Test finding a customer by license number
    @Test
    public void testFindCustomerByLicenseNumber() {
        Controller controller = new Controller();
        controller.addNewCustomer("Alice Smith", 25, "DL987654", "0987654321");
        Customer foundCustomer = controller.findCustomer("DL987654");
        Assertions.assertNotNull(foundCustomer);
    }

    // Assertion Case 5: Test displaying available cars
    @Test
    public void testDisplayAvailableCars() {
        Controller controller = new Controller();
        controller.addNewCar("Ford Mustang", "Ford", "MNO456", 60, 25000, "Black");
        controller.addNewCar("Chevrolet Cruze", "Chevrolet", "PQR789", 45, 22000, "White");
        controller.displayAvailableCars();
        Assertions.assertEquals(2, controller.availableCars.size());
    }

}