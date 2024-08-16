import com.assignment2.Bike;
import com.assignment2.ElectricBike;
import com.assignment2.ElectricVehicle;
import com.assignment2.Vehicle;

public class Main {
    public static void main(String[] args) {

        Vehicle v = new Bike();
        v.maxSpeed();
        v.model();
        ElectricVehicle ev = new ElectricBike();
        ev.model();
        ev.seats();
    }
}