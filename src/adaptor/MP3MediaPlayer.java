package adaptor;

public class MP3MediaPlayer implements MediaPlayer {
    @Override
    public void play(String filepath) {
        System.out.println("Playing MP3 file " + filepath);
    }
}
