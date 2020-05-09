# OO Design Structure

##### Reference
https://www.tutorialspoint.com/design_pattern/adapter_pattern.htm

---

## IAdvancedMediaPlayer Interface
 #### Methods:
 - playVlc(Media media)
 - playMp4(Media media)

## IMediaPlayer Interface
 #### Methods:
 - play(Media media)

---

## Media Class
 #### Attributes:
 - FileName String
 - FileFormat String

## VlcPlayer Class implements IAdvancedMediaPlayer
 #### Methods:
 - playVlc(Media media)
 - playMp4(Media media)

## Mp4Player Class implements IAdvancedMediaPlayer
 #### Methods:
 - playVlc(Media media)
 - playMp4(Media media)

## MediaAdapter Class implements IMediaPlayer
 // ADAPTER CLASS
 #### Attributes:
 - advancedMediaPlayer IAdvancedMediaPlayer
 #### Methods:
 - play(Media media)
 - MediaAdapter(String format) \
 // constructor - creates IAdvancedMediaPlayer object by format

## AudioPlayer Class implements IMediaPlayer
 // Only able to mp3 formats
 #### Attributes:
 - mediaAdapter MediaAdapter
 #### Methods:
 - play(Media media)

---

# Use Adapter Pattern