package ObserverPatterm;

public interface Subject {

    void registerObserver(Observer o);

    void removeObserver(Observer o);

    public void notifyObserver ();
}
