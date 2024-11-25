package strategyDesign2;

public class GoodsVehicle extends Vehicle {
    GoodsVehicle(){
        super(new NormalStrategy());
    }
}
