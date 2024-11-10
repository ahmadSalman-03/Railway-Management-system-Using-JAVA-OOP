import java.util.ArrayList;
import java.util.Scanner;

public class station
{
    private String StationName;
    ArrayList<Train> trains;
    Scanner sc = new Scanner(System.in);

    public station(String stationName, ArrayList<Train> trains) {
        StationName = stationName;
        this.trains = trains;
    }

    public station(String stationName) {
        StationName = stationName;
    }

    public int NumberOfPassengers()
    {
        int count =0;
        for (Train t : trains) {
               count = count + trains.size();
        }
        return count;
    }
    public void addTrains()
    {
        System.out.println("Enter Train Name ");
        String name = sc.next();
        System.out.println("Enter train id ");
        String id = sc.next();
        trains.add(new Train(name,id));
    }

    public void displayTrains()
    {
        System.out.println("--------Trains--------");
        System.out.println("Train Name \t\t Train Id");
        for (Train t : trains) System.out.println(t.getTrainName() + "\t\t" + t.getTrainId());
    }

    public int upDateTrain(String trainName)
    {
        for (Train t : trains)
        {
            if (findTrain(trainName)!=0)
            {
                System.out.println("Enter Name");
                t.setTrainName(sc.next());
                System.out.println("Enter id");
                t.setTrainId(sc.next());
            }
        }
        return 0;
    }
    public int findTrain(String TrainName)
    {
        for (Train t : trains) if (t.getTrainName().equalsIgnoreCase(TrainName)) return getTrains().indexOf(t);
        return 0;
    }

    public String getStationName() {
        return StationName;
    }

    public void setStationName(String stationName) {
        StationName = stationName;
    }

    public ArrayList<Train> getTrains() {
        return trains;
    }

    public void setTrains(ArrayList<Train> trains) {
        this.trains = trains;
    }
}
