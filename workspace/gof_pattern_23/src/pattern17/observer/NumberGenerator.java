package pattern17.observer;

import java.util.ArrayList;

public abstract class NumberGenerator {

    private ArrayList<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {

        observers.stream().forEach(o -> {
            o.update(this);
        });
    }

    public abstract int getNumber();
    public abstract void execute();

}
