package adaptor;

import adaptor.image.JpegImageViewer;

public class JpegAdaptor implements MediaPlayer {

    private JpegImageViewer jpegImageViewer;

    public JpegAdaptor(JpegImageViewer jpegImageViewer) {
        this.jpegImageViewer = jpegImageViewer;
    }

    @Override
    public void play(String filepath) {
        jpegImageViewer.show(filepath);
    }
}
