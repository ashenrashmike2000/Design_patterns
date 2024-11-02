package adaptor.image;

public class JpegImageViewer implements ImageViewer {
    @Override
    public void show(String file) {
        System.out.println("Showing JPEG image " + file);
    }
}
