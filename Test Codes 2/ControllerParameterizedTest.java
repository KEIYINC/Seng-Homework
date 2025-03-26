package main.controller;

import main.controller.Controller;
import main.model.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ControllerParameterizedTest {

    // Parameterized test to verify that adding a new car increases the available cars count
    @ParameterizedTest
    @CsvSource({
            "Toyota Camry, Toyota, ABC123, 50, 20000, Blue",
            "Honda Civic, Honda, XYZ789, 40, 18000, Red"
    })
    public void testAddNewCarIncreasesAvailableCars(String name, String brand, String numberPlate,
                                                    int rentPricePerDay, int costPrice, String color) {
        Controller controller = new Controller();
        int initialAvailableCarsCount = controller.availableCars.size(); // Use availableCars list directly
        controller.addNewCar(name, brand, numberPlate, rentPricePerDay, costPrice, color);
        int updatedAvailableCarsCount = controller.availableCars.size(); // Use availableCars list directly
        Assertions.assertEquals(initialAvailableCarsCount + 1, updatedAvailableCarsCount);
    }
}
