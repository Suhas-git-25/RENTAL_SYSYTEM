# Vehicle Management System

This is a simple **Java-based Vehicle Management System** that models a rental service for different types of vehicles including cars, trucks, and motorcycles. It uses object-oriented principles such as inheritance, abstraction, and interfaces.

## Features

- Define and manage different types of vehicles.
- Rent and return vehicles.
- Calculate rental costs (with different pricing strategies for cars and trucks).
- Schedule maintenance and check maintenance status.

## Project Structure

- **`Maintained`**: Interface with methods for maintenance scheduling and checks.
- **`Vehicle`**: Abstract base class implementing `Maintained` and providing core functionality.
- **`Car`, `Truck`, `Motorcycle`**: Subclasses of `Vehicle` with custom rental cost logic.
- **`VehicleManagementSystem`**: Main class that demonstrates system functionality with a sample fleet.

## How to Run

### Requirements
- Java JDK 8 or later

### Steps
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/vehicle-management-system.git
   cd vehicle-management-system
Compile and run the program:

bash
Copy
Edit
javac VehicleManagementSystem.java
java VehicleManagementSystem
Example Output
nginx
Copy
Edit
Rental Cost: $275.0
(The cost above assumes the first vehicle, a Car, was rented for 5 days with a 10% premium.)

Future Improvements
Add user input (CLI or GUI).

Store and load fleet data from a file or database.

Enhance maintenance scheduling with dates.

Add unit tests for core functionality.

License
This project is open-source and available under the MIT License.
