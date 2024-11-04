package observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observerList = new ArrayList<>();

    public void registerObserver(Observer observer){
        this.observerList.add(observer);
    }

    public void removeObserver(Observer observer){
        this.observerList.remove(observer);
    }

    public void notifyAllObservers(String event){
        for(Observer observer : observerList){
            observer.notifyMe(event);
        }
    }
}
