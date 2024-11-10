1. demo.java
Main Class: The demo class serves as the main entry point of the system, presenting a menu-driven interface for managing different functionalities of the railway system (trains, food services, staff, and passenger management).

Key OOP Concepts:

Encapsulation: Manages access to system functionalities through structured methods and a menu-based interface.
Abstraction: Provides an interface for high-level interactions like adding, viewing, and updating train information without exposing internal details.
2. Food.java
This class represents food items available on the train.

Key OOP Concepts:

Encapsulation: Properties like food name, price, and quantity are encapsulated within the class with getters and setters to control access.
3. Staff.java
This class manages details of staff members on the trains.

Key OOP Concepts:

Encapsulation: Staff details like name, age, and position are encapsulated with proper getters and setters.
Inheritance: Could potentially inherit common properties (if they exist in another class), though it doesn’t directly do so here.
4. Train.java
The Train class models individual trains, including their names and IDs.

Key OOP Concepts:

Encapsulation: Train properties like trainName and trainId are private, with controlled access through methods.
Aggregation: Holds lists of Staff and Food objects, showing the relationship between a train and the staff/food associated with it.
5. login.java
This interface defines methods for signIn and signUp, which are implemented by classes like manager.

Key OOP Concepts:

Interface: Defines the login interface with signIn and signUp methods, specifying a contract that classes like manager must implement.
6. manager.java
This class represents a manager and implements the login interface, managing login and registration functionality.

Key OOP Concepts:

Inheritance: Inherits from person to reuse common properties like name and age.
Interface Implementation: Implements the login interface, providing functionality for signIn and signUp.
Encapsulation: Manages sensitive data like email and password with controlled access through setters and getters.
7. passenger.java
The passenger class represents passengers traveling on the train, extending person.

Key OOP Concepts:

Inheritance: Inherits from person, reusing attributes like name and age.
Method Overriding: Overrides toString to provide a customized string representation of passenger information.
8. person.java
The person class is a base class containing common attributes for other entities like manager and passenger.

Key OOP Concepts:

Encapsulation: Private attributes name and age are managed through getters and setters.
Inheritance: Serves as a superclass, enabling code reuse for common properties in subclasses like manager and passenger.
9. station.java
This class represents a station, managing trains associated with it.

Key OOP Concepts:

Encapsulation: Manages station properties like stationName and list of Train objects privately.
Composition: Contains an ArrayList of Train objects, which represents a "has-a" relationship.
Methods for Operations: Includes methods for adding, displaying, updating, and finding trains, encapsulating the functionality specific to stations.
This project demonstrates fundamental OOP principles, including Encapsulation (through private attributes and getters/setters), Inheritance (in classes like manager and passenger), Abstraction (in classes that provide structured interfaces for specific functionalities), and Polymorphism (with interface login and overriding toString in passenger). Each component is well-defined, allowing for organized, modular management of railway operations. ​
