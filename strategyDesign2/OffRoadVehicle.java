package strategyDesign2;

public class OffRoadVehicle extends Vehicle{
    OffRoadVehicle(){
        super(new SportStrategy());
    }
}
