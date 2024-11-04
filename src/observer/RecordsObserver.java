package observer;

public class RecordsObserver implements Observer {
    @Override
    public void notifyMe(MatchEvent event) {
        //todo: check whether any new records available
        // if so add those to a database.
        System.out.println("updating the records observer: ");
    }
}
