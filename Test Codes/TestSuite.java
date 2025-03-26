package main.controller;

import main.controller.ControllerTest;
import main.controller.ControllerTestTwo;
import main.model.Customer;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(JUnitPlatform.class)
@SelectClasses({ControllerTest.class, ControllerTestTwo.class})
public class TestSuite {
    // Test suite logic here
    @Test
    public void testFindCustomerByLicenseNumber() {
        Controller controller = new Controller();
        controller.addNewCustomer("Alice Smith", 25, "DL987654", "0987654321");
        Customer foundCustomer = controller.findCustomer("DL987654");
        Assertions.assertNotNull(foundCustomer);
    }
    public void testRemoveCustomer() {
        Controller controller = new Controller();
        controller.addNewCustomer("Emily Davis", 28, "DL777777", "7777777777");
        Customer removedCustomer = controller.removeCustomer("DL777777");
        Assertions.assertNotNull(removedCustomer);
    }
}
