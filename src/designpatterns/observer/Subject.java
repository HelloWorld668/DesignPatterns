package designpatterns.observer;

public interface Subject {
    void registObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver();
}
