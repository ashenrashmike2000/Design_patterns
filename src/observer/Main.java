package observer;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Observer windPredictor = new WinPredictorObserver();
        Observer battingCard = new BattingCardObserver();
        Observer bowlingCard = new BowlingCardObserver();
        Observer records = new RecordsObserver();

        Subject subject = new Subject();
        subject.registerObserver(windPredictor);
        subject.registerObserver(battingCard);
        subject.registerObserver(bowlingCard);
        subject.registerObserver(records);

        MatchEvent event1 = new MatchEvent();
        event1.setBowlerName("Malinga");
        event1.setBat1Score(100);
        event1.setBat2Score(50);
        event1.setCurrentOver(10);
        event1.setDelivery(3);

        subject.notifyAllObservers(event1);

        Thread.sleep(5000);

        MatchEvent event2 = new MatchEvent();
        event2.setBowlerName("Malinga");
        event2.setBat1Score(100);
        event2.setBat2Score(50);
        event2.setCurrentOver(10);
        event2.setDelivery(4);

        subject.notifyAllObservers(event2);


        //actions we can take for a delivery event:
        // update the win predictor -> WinPredictorObserver
        // update the batting card -> BattingCardObserver
        // update the bowling card -> BowlingCardObserver
        // update the records  -> RecordsObserver
    }
}
