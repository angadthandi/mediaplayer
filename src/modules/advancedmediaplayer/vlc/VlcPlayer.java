package modules.advancedmediaplayer.vlc;

import modules.advancedmediaplayer.IAdvancedMediaPlayer;
import modules.media.Media;

public class VlcPlayer implements IAdvancedMediaPlayer {

    public void play(Media media) {
        System.out.printf("Playing Vlc: %s \n", media.FileName);
    }

}