package observer;

public class Main {
    public static void main(String[] args){
        Observer observer1 = new Type1Observer();
        Observer observer2 = new Type2Observer();

        Subject subject = new Subject();
        subject.registerObserver(observer1);
        subject.registerObserver(observer2);
        subject.notifyAllObservers("Event 1");

        subject.removeObserver(observer1);
        subject.notifyAllObservers("Event 2");
    }
}
