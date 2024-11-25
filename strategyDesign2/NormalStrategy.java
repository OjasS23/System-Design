package strategyDesign2;

public class NormalStrategy implements DriveStrategy{

    @Override
    public void drive(){
        System.out.println("Normal Strategy");
    }
}
