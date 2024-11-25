package strategyDesign2;

public class SportStrategy implements DriveStrategy {

    @Override
    public void drive(){
        System.out.println("Sports Drive Strategy");
    }
}
