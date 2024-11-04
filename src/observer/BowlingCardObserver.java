package observer;

public class BowlingCardObserver implements Observer {
    @Override
    public void notifyMe(MatchEvent event) {
        System.out.println("updating the bowling card BowlerName: " + event.getBowlerName());
    }
}
