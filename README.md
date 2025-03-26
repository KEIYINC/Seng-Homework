# Car Rental Management System Report

**Name**: Umut Eren KEIYINCI  
**Student Number**: 17578815226  

## Introduction
The **Car Rental Management System** is a Java-based application designed to manage the renting of cars to customers. The system provides functionality for adding new cars and customers, displaying available cars for rent, renting cars to customers, displaying customer details, managing rental details, and more. The system follows **Object-Oriented Programming (OOP)** principles for better modularity, maintainability, and scalability.

## Features

- **Adding New Cars**:  
  Allows users to add new cars to the system with details such as:
  - Name
  - Brand
  - License Plate Number
  - Rent Price Per Day
  - Cost Price
  - Color

- **Adding New Customers**:  
  Provides functionality for adding new customers with the following details:
  - Name
  - Age
  - License Number
  - National ID Number

- **Displaying Cars and Customers**:  
  Allows users to view all cars and customers stored in the system.

- **Renting Cars**:  
  Enables users to rent cars to customers for a specified number of days.

- **Managing Rental Details**:  
  Provides options for displaying rent details of a customer, releasing a rented car from a customer, and viewing all rental transactions.

- **Modifying Car Details**:  
  Allows users to modify details of existing cars, including color, price, license plate number, and more.

- **Removing Cars and Customers**:  
  Provides functionality for removing cars and customers from the system.

- **Searching Cars by Name or Brand**:  
  Enables users to search for cars by name or brand.

## Implementation
The system is implemented using **object-oriented programming principles** in Java. It consists of four main classes:

### 1. **Main Class**:
  - Contains the `main` method.
  - Handles user interactions through a console-based menu system for performing various operations.

### 2. **Controller Class**:
  - Manages the business logic of the system.
  - Handles operations such as adding, removing, modifying cars and customers, and performing rental operations.

### 3. **Car Class**:
  - Represents a car object with the following properties:
    - `name`: The name of the car.
    - `brand`: The brand of the car.
    - `licensePlate`: The license plate number of the car.
    - `rentPricePerDay`: The rent price per day for the car.
    - `costPrice`: The cost price of the car.
    - `color`: The color of the car.
    - `rentalDetails`: Rental-related information, including the customer who rented the car and rental duration.

### 4. **Customer Class**:
  - Represents a customer object with the following properties:
    - `name`: The name of the customer.
    - `age`: The age of the customer.
    - `licenseNumber`: The driver's license number of the customer.
    - `nationalIdNumber`: The national ID number of the customer.
    - `rentedCars`: A list of cars rented by the customer.

## Example Assertion Case Test

- **Test Case 1**: Adding a New Car  
  **Test Assertion**:  
  Verify that after adding a new car with the details:
  - Name: "Tesla Model S"
  - Brand: "Tesla"
  - License Plate: "123-XYZ"
  - Rent Price: 100$
  - Cost Price: 50000$
  - Color: "Red"  

  The car should appear in the system's car list.

- **Test Case 2**: Renting a Car to a Customer  
  **Test Assertion**:  
  After renting a car to a customer, the customer should have a rented car listed in their profile, and the car's availability should be updated to "not available."

- **Test Case 3**: Searching Cars by Brand  
  **Test Assertion**:  
  Search for a car with the brand "Tesla" and verify that all matching cars are returned in the search results.
