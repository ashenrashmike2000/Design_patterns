package adaptor;

public class MediaPlayerFactory {

    public static MediaPlayer getInstance (String file){

        MediaPlayer mediaPlayer = null;

        if (file.endsWith(".mp3")){
            mediaPlayer = new MP3MediaPlayer();
        }
        if (file.endsWith(".mp4")){
            mediaPlayer = new MP4MediaPlayer();
        }

        return mediaPlayer;
    }
}
