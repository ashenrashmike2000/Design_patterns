package adaptor;

public class MP4MediaPlayer implements MediaPlayer {
    @Override
    public void play(String filepath) {
        System.out.println("Playing MP4 files " + filepath);
    }
}
