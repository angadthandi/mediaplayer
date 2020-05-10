package modules.mediaformat;

public enum MediaFormat {
    MP3(0),
    MP4(1),
    VLC(2);

    private int value;

    private MediaFormat(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}