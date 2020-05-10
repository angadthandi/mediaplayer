import modules.media.Media;
import modules.mediaformat.MediaFormat;
import modules.mediaplayer.audio.AudioPlayer;

public class App {
    public static void main(String[] args) throws Exception {
        Media m1 = new Media();
        m1.FileFormat = MediaFormat.MP3;
        m1.FileName = "Pind Pehra Lagda";

        Media m2 = new Media();
        m2.FileFormat = MediaFormat.MP4;
        m2.FileName = "Chaklo";

        Media m3 = new Media();
        m3.FileFormat = MediaFormat.VLC;
        m3.FileName = "License";

        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play(m1);
        audioPlayer.play(m2);
        audioPlayer.play(m3);
    }
}
