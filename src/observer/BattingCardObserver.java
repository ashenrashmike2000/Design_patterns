package observer;

public class BattingCardObserver implements Observer {
    @Override
    public void notifyMe(MatchEvent event) {
        System.out.println("updating the batting card Batsman 1: " + event.getBat1Score() + " Batsman 2: " + event.getBat2Score());
    }
}
