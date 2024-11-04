package observer;

public class WinPredictorObserver implements Observer {
    @Override
    public void notifyMe(MatchEvent event) {
        //todo: calculate the win probabilities based on the new event data.

        System.out.println("updating the win predictor: ");
    }
}
