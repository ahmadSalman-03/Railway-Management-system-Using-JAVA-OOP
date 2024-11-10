import java.util.ArrayList;
import java.util.Scanner;

public class Train {
    private String trainName;
    private String trainId;

    ArrayList<Staff> staff;
    ArrayList<passenger> passengers;
    ArrayList<Food> foods;

    Scanner sc = new Scanner(System.in);

    public Train(String trainName, String trainId, ArrayList<Staff> staff, ArrayList<passenger> passengers,
            ArrayList<Food> foods) {
        this.trainName = trainName;
        this.trainId = trainId;
        this.staff = staff;
        this.passengers = passengers;
        this.foods = foods;
    }

    public Train(String trainName, String trainId) {
        this.trainName = trainName;
        this.trainId = trainId;
    }

    public void addStaff() {
        System.out.println("Enter Staff Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Staff age: ");
        int age = sc.nextInt();
        System.out.println("Enter Staff id: ");
        String id = sc.next();
        System.out.println("Enter email ");
        String email = sc.next();
        System.out.println("Enter Password ");
        String password = sc.next();
        staff.add(new Staff(name, age, id, email, password));
    }

    public void viewStaff() {
        System.out.println("Name\t\tId\t\tAge");
        for (Staff value : staff) {
            System.out.println(value.getName() + "\t\t  " + value.getId() + "\t\t  " + value.getAge());
        }
    }

    public void addPassenger() {
        System.out.println("Enter Passenger Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Passenger age: ");
        int age = sc.nextInt();
        passengers.add(new passenger(name, age));
    }

    public void addFood() {
        System.out.println("Enter Food Name ");
        String name = sc.next();
        System.out.println("Enter Price ");
        int price = sc.nextInt();
        foods.add(new Food(name, price));
    }

    public void viewFood() {
        System.out.println("--------> Food Menu  <--------");
        System.out.println("Item\t\tPrice");
        for (Food food : foods)
            System.out.println(food.getFoodName() + "\t\t" + food.getPrice());
    }

    public void viewPassenger() {
        System.out.println("-------->  Passenger Information  <--------");
        for (passenger passenger : passengers) {
            System.out.println("Name: " + passenger.getName());
            System.out.println("Age: " + passenger.getAge());

        }
    }

    public Food findFood(ArrayList<Food> foods, String text) {
        for (Food food : foods) {
            if (String.valueOf(food.getFoodName()).equals(text) || food.getFoodName().equalsIgnoreCase(text)) {
                return food;
            }
        }
        return null;
    }

    public int findStaff(String staffName) {
        for (Staff s : staff)
            if (s.getName().equalsIgnoreCase(staffName))
                return getStaff().indexOf(s);
        return 0;
    }

    public ArrayList<Staff> getStaff() {
        return staff;
    }

    public void setStaff(ArrayList<Staff> staff) {
        this.staff = staff;
    }

    public ArrayList<passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<passenger> passengers) {
        this.passengers = passengers;
    }

    public ArrayList<Food> getFoods() {
        return foods;
    }

    public void setFoods(ArrayList<Food> foods) {
        this.foods = foods;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public String getTrainId() {
        return trainId;
    }

    public void setTrainId(String trainId) {
        this.trainId = trainId;
    }

    public String toString() {
        return "Train :\t" + getTrainName() +
                "ID:\t" + getTrainId();
    }
}