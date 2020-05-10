package modules.mediaadapter;

import modules.advancedmediaplayer.IAdvancedMediaPlayer;
import modules.advancedmediaplayer.mp4.Mp4Player;
import modules.advancedmediaplayer.vlc.VlcPlayer;
import modules.media.Media;
import modules.mediaformat.MediaFormat;
import modules.mediaplayer.IMediaPlayer;

public class MediaAdapter implements IMediaPlayer {
    private IAdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(MediaFormat format) {
        switch (format) {
            case MP4:
                advancedMediaPlayer = new Mp4Player();
            break;
            case VLC:
                advancedMediaPlayer = new VlcPlayer();
            break;
        }
    }

    public void play(Media media) {
        advancedMediaPlayer.play(media);
    }

}