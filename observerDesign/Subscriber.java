package observerDesign;
// package observerDesign;

public class Subscriber implements Observer {

    String name;
    Subscriber(String name){
        this.name=name;
    }
    @Override
    public void notified(String notification) {
        System.out.println("Hello "+ this.name +" New video uploaded:" + notification);
    }
    
}
