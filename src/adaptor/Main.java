package adaptor;

public class Main {
    public static void main(String[] args) {
        String file  = args[0];

        MediaPlayer mediaPlayer = MediaPlayerFactory.getInstance(file);

        if(mediaPlayer != null) {
            mediaPlayer.play(file);
        }
        else{
            System.out.println("Could not find the media player.");
        }
    }
}