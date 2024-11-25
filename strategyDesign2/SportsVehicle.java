package strategyDesign2;

public class SportsVehicle extends Vehicle {
    SportsVehicle(){
        super(new SportStrategy());
    }
}
