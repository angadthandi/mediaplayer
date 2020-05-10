package modules.mediaplayer.audio;

import modules.media.Media;
import modules.mediaadapter.MediaAdapter;
import modules.mediaformat.MediaFormat;
import modules.mediaplayer.IMediaPlayer;

public class AudioPlayer implements IMediaPlayer {
    private MediaAdapter mediaAdapter;

    public void play(Media media) {
        if (media.FileFormat == MediaFormat.MP3) {
            System.out.printf("Playing Mp3: %s \n", media.FileName);
        } else {
            mediaAdapter = new MediaAdapter(media.FileFormat);
            mediaAdapter.play(media);
        }
    }

}