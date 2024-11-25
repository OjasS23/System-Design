public class EmployeeFactory {
    public static Employee getEmployee(String empT){
        if(empT.trim().equalsIgnoreCase("AndroidD")){
            return new AndroidD();
        }else if(empT.trim().equalsIgnoreCase("WebD")){
            return new WebD();
        }else{
            return null;
        }
    }
}
