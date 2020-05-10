package modules.advancedmediaplayer.mp4;

import modules.advancedmediaplayer.IAdvancedMediaPlayer;
import modules.media.Media;

public class Mp4Player implements IAdvancedMediaPlayer {

    public void play(Media media) {
        System.out.printf("Playing Mp4: %s \n", media.FileName);
    }

}