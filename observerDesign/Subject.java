package observerDesign;
public interface Subject {

    void subscribe(Observer ob);
    void unsubscribe(Observer ob);
    void notifyChanges(String changes);
}