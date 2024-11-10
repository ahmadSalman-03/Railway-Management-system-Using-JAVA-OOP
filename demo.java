import java.util.*;
public class demo
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        String name, password, id;
        boolean Login = false;

        // Pre-defined ArrayList of Managers
        ArrayList<manager> managers = new ArrayList<>();
        managers.add(new manager("Fahad", 20, "fahad3310@gmail.com", "101"));
        managers.add(new manager("Ahmad", 29, "ahmad11@gmail.com", "123"));
        managers.add(new manager("Rahat", 49, "rahat22@gmail.com", "456"));

        //pre defined staff
        ArrayList<Staff> staff1 = new ArrayList<>();
        staff1.add(new Staff("Hassan", 25, "123", "Hassan@gmail.com", "hassan123"));
        staff1.add(new Staff("Umair", 20, "456", "Umair123@gmail.com", "Umair123"));

        ArrayList<Staff> staff2 = new ArrayList<>();
        staff2.add((new Staff("Ali", 21, "312", "Ali@gmail.com", "ali123")));
        staff2.add((new Staff("akhtar", 35, "423", "akhtar@gmail.com", "akhtar123")));

        ArrayList<Staff> staff3 = new ArrayList<>();
        staff3.add((new Staff("Umer", 45, "233", "umer@gmail.com", "umer123")));
        staff3.add((new Staff("zain", 55, "533", "zain@gmail.com", "zain123")));

        // Pre-defined ArrayList of food
        ArrayList<Food> food1 = new ArrayList<>();
        food1.add(new Food("Zinger Burger ", 300));
        food1.add(new Food("pepsi-250ml ", 50));

        ArrayList<Food> food2 = new ArrayList<>();
        food2.add(new Food("Paratha Roll ", 150));
        food2.add(new Food("Shawarma ", 150));

        ArrayList<Food> food3 = new ArrayList<>();
        food3.add(new Food("Naan_Channy", 150));
        food3.add(new Food("Shawarma ", 150));


        // Pre-defined ArrayList of Passengers
        ArrayList<passenger> passenger1 = new ArrayList<>();
        passenger1.add(new passenger("Noor", 20));
        passenger1.add(new passenger("Iman", 40));
        passenger1.add(new passenger("uzair", 25));

        ArrayList<passenger> passenger2 = new ArrayList<>();
        passenger2.add(new passenger("jamil", 45));
        passenger2.add(new passenger("Abdullah", 55));

        ArrayList<passenger> passenger3 = new ArrayList<>();
        passenger3.add(new passenger("Tahir", 39));
        passenger3.add(new passenger("Tabish", 39));

        ArrayList<passenger> passenger4 = new ArrayList<>();
        passenger4.add(new passenger("kiran", 50));
        passenger4.add(new passenger("Nawaz", 20));

        // Pre-defined ArrayList of Train
        ArrayList<Train> train1 = new ArrayList<>();
        train1.add(new Train("Rehman Baba", "101", staff1, passenger1, food1));
        train1.add(new Train("Khushal Khatak", "102", staff2, passenger2, food2));

        ArrayList<Train> train2 = new ArrayList<>();
        train2.add(new Train("Awam Express", "103", staff3, passenger3, food3));
        train2.add(new Train("Mehar Express", "103", staff3, passenger4, food3));

        // Pre-defined ArrayList of Station
        ArrayList<station> stations = new ArrayList<>();
        stations.add(new station("Attock ", train1));
        stations.add(new station("Peshawar ", train2));


        for (station s : stations)
        {
            System.out.println("\nStation " + s.getStationName());
            s.displayTrains();
        }
        System.out.println("\nWelcome to Railway Reservation System\n");
        do {
            System.out.println("""
                    Press!
                    1 for Manager Portal
                    2 for Passenger Portal
                    other to exit
                    """);
            switch (sc.nextInt()) {
                case 1 -> {
                    System.out.println("\n\t\t\tMANAGERS");
                    System.out.println("========================");
                    System.out.println("Name \t\tAge \t\t Email \t\t\t Password");
                    for (manager m : managers)
                        System.out.println(m.getName() + "\t\t" + m.getAge() + "\t\t" + m.getEmail() + "\t\t " + m.getPassword());
                    System.out.println("========================");
                    System.out.println(""" 
                            \t\tManager Portal
                            Press!
                            1 For Login
                            2 For SignUp
                            """);
                    switch (sc.nextInt()) {
                        case 1 -> {
                            System.out.println("Enter your Name ");
                            name = sc.next();
                            System.out.println("Enter Your Password ");
                            password = sc.next();
                            for (manager m : managers) {
                                if (m.signIn(name, password)) {
                                    System.out.println("Login Successful ");
                                    Login = true;
                                }
                            }
                            if (Login) {
                                System.out.println("""
                                        press!
                                        1 for trains Menu
                                        2 for food Menu
                                        3 for staff Menu
                                        4 for Passenger Manu
                                        5 to exit
                                        """);
                                switch (sc.nextInt()) {
                                    case 1 -> {
                                        System.out.println("welcome to Train Menu");
                                        System.out.println("""
                                                PRESS
                                                1 for add trains
                                                2 for view train
                                                3 for Search train
                                                4 for update train
                                                """);
                                        switch (sc.nextInt()) {
                                            case 1 -> {
                                                do {
                                                    System.out.println(" Available Stations are ");
                                                    displayStation(stations);
                                                    System.out.println("Enter station Number to add train ");
                                                    try {
                                                        stations.get(sc.nextInt() - 1).addTrains();
                                                        System.out.println("New Train Added Successfully!");
                                                    } catch (Exception e) {
                                                        System.out.println("Station Not found");
                                                    }
                                                    System.out.println("Press 1 to add more ");
                                                } while (sc.nextInt() == 1);
                                            }
                                            case 2 -> {
                                                for (station s : stations) s.displayTrains();
                                            }
                                            case 3 -> {
                                                System.out.println("Enter train Name");
                                                name = sc.nextLine();
                                                name = sc.nextLine();
                                                for (station s : stations)
                                                    if (s.findTrain(name) != 0)
                                                        System.out.println("Searched Train\t" + s.findTrain(name));
                                            }
                                            case 4 -> {
                                                for (station s : stations) s.displayTrains();
                                                System.out.println("Select train ");
                                                name = sc.nextLine();
                                                name = sc.nextLine();
                                                for (station s : stations) {
                                                    int trainIndex = s.findTrain(name);
                                                    if (trainIndex <= s.trains.size()) {
                                                        System.out.println("Train Found ");
                                                        System.out.println("""
                                                                Press
                                                                1 for Change Name
                                                                2 for id
                                                                3 for whole train
                                                                """);
                                                        switch (sc.nextInt()) {
                                                            case 1 -> {
                                                                System.out.println("Enter New Name ");
                                                                name = sc.nextLine();
                                                                name = sc.nextLine();
                                                                s.trains.get(trainIndex).setTrainName(name);
                                                                System.out.println("Updated Successfully");
                                                            }
                                                            case 2 -> {
                                                                System.out.println("Enter Id");
                                                                id = sc.next();
                                                                s.trains.get(trainIndex).setTrainId(id);
                                                                System.out.println("Updated Successfully");
                                                            }
                                                            case 3 -> {
                                                                for (station st : stations) {
                                                                    if (st.upDateTrain(name) != 0)
                                                                        System.out.println("Updated successfully");
                                                                }
                                                            }
                                                        }
                                                    }
                                                    if (trainIndex < s.trains.size()) break;
                                                }
                                            }
                                        }
                                    }
                                    case 2 -> {
                                        System.out.println("""
                                                Welcome to Food Menu
                                                Press!
                                                1 For add Food
                                                2 for View Food
                                                3 For Update Food
                                                4 For Remove Food
                                                """);
                                        switch (sc.nextInt()) {
                                            case 1 -> {
                                                for (station s : stations) s.displayTrains();
                                                System.out.println("Enter Train to add Food ");
                                                name = sc.nextLine();
                                                name = sc.nextLine();
                                                for (station s : stations) {
                                                    int trainIndex = s.findTrain(name);
                                                    if (trainIndex <= s.trains.size()) {
                                                        s.trains.get(trainIndex).addFood();
                                                        break;
                                                    }
                                                }
                                            }
                                            case 2 -> {
                                                for (station s : stations) for (Train t : s.trains) t.viewFood();
                                            }
                                            case 3 -> {
                                                System.out.println("find Food");
                                            }
                                            case 4 -> {
                                                System.out.println("Update food");
                                            }
                                        }
                                    }
                                    case 3 -> {
                                        System.out.println("""
                                                                                                
                                                Welcome to Staff Menu
                                                Press
                                                1 for add Staff
                                                2 for View Staff Data
                                                3 for Search Staff Member Data
                                                4 for Remove any Staff
                                                """);
                                        switch (sc.nextInt()) {
                                            case 1 -> {
                                                for (station s : stations) s.displayTrains();
                                                System.out.println("Enter Train to add Staff ");
                                                name = sc.nextLine();
                                                name = sc.nextLine();
                                                for (station s : stations) {
                                                    int trainIndex = s.findTrain(name);
                                                    if (trainIndex < s.trains.size()) {
                                                        System.out.println("\nSelect Train\t" + s.trains.get(trainIndex).getTrainName());
                                                        s.trains.get(trainIndex).addStaff();
                                                        break;
                                                    }
                                                }
                                            }
                                            case 2 -> {
                                                for (station s : stations) for (Train t : s.trains) t.viewStaff();
                                            }
                                            case 3 -> {
                                                System.out.println("Enter Staff Name to Search ");
                                                name = sc.next();
                                                for (station s : stations) {
                                                    for (Train t : s.trains) {
                                                        int staffIndex = t.findStaff(name);
                                                        if (staffIndex < t.staff.size()) {
                                                            System.out.println("Staff Found ");
                                                            System.out.println("Name\t" + t.staff.get(staffIndex).getName());
                                                            System.out.println("Age\t" + t.staff.get(staffIndex).getAge());
                                                            System.out.println("Email\t" + t.staff.get(staffIndex).getEmail());
                                                            System.out.println("Id\t" + t.staff.get(staffIndex).getId());
                                                            System.out.println("Password\t" + t.staff.get(staffIndex).getPassword());
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    case 4 -> {
                                        System.out.println("""
                                                Welcome to Passenger Menu
                                                press!
                                                1 for add Passenger
                                                2 for view Passengers Data
                                                3 for search Passenger
                                                4 for remove Passenger
                                                """);
                                        switch (sc.nextInt())
                                        {
                                            case 1->{}
                                            case 2 ->
                                            {
                                                for (station s : stations) for (Train t : s.trains) t.viewPassenger();
                                                System.out.println("Total Number of Passengers are ");
                                                int count=0;
                                                for (station s : stations) {
                                                    count = count +s.NumberOfPassengers();
                                                }
                                                System.out.println(count);
                                            }
                                        }
                                    }
                                }
                            } else System.out.println("Login Denied");
                        }
                        case 2 -> SignUp(managers);
                    }
                }
                case 2 -> {
                    System.out.println("Passenger Portal");
                    for (station s : stations) {
                        System.out.println("\nTrains For " + s.getStationName());
                        s.displayTrains();
                    }
                    System.out.println("Enter Train Name for your destination");
                    name = sc.nextLine();
                    name = sc.nextLine();
                    for (station s : stations) {
                        if (s.findTrain(name) != 0) {
                            System.out.println("Searched Train\t" + s.findTrain(name));
                        }
                    }

                }
            }
            System.out.println("""
                    Press
                    Y to Go Back to Main Manu
                    other to exit
                    """);
        } while (sc.next().equalsIgnoreCase("y"));
    }

    public static void addStation(ArrayList<station> stations) {
        System.out.println("Enter station Name ");
        String name = sc.next();
        stations.add(new station(name));
    }

    public static int findStation(ArrayList<station> stations, String stationName) {
        for (station s : stations) if (s.getStationName().equalsIgnoreCase(stationName)) return stations.indexOf(s);
        return 0;
    }

    public static void displayStation(ArrayList<station> stations) {
        System.out.println("--------Stations--------");
        for (station s : stations) System.out.println(s.getStationName());
    }

    public static void SignUp(ArrayList<manager> managers) 
    {
        System.out.println("Creating New Account\n");
        System.out.println("Enter Your Name ");
        String name = sc.next();
        System.out.println("Enter your Age should be greater than 19 ");
        int age = sc.nextInt();
        System.out.println("Enter your Email Address");
        String email = sc.next();
        System.out.println("set your Password ");
        String password = sc.next();
        managers.add(new manager(name, age, email, password));
        System.out.println("Data Received ");
        if (managers.get(managers.size() - 1).signUp(name, age, password)) System.out.println("Account created");
        else {
            System.out.println("""
                    wrong data entry
                    account creation denied
                    """);
            managers.remove(managers.size() - 1);
        }
    }
}
