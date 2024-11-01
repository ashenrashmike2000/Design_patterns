package singleton;

public class Clipboard {

    private static Clipboard instance = null;

    private Clipboard() {


    }

    public static Clipboard getInstance() {

        if(instance == null){
            instance = new Clipboard();
        }

        return instance;
    }

    private String value;

    public void copy(String data){
        this.value = data;
    }

    public String paste(){
        return this.value;
    }
}
