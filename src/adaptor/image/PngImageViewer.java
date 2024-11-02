package adaptor.image;

public class PngImageViewer implements ImageViewer {
    @Override
    public void show(String file) {
        System.out.println("Showing PNG image " + file);
    }
}
