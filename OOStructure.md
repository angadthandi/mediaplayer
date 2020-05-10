# OO Design Structure

##### Reference
https://www.tutorialspoint.com/design_pattern/adapter_pattern.htm - with if/else
https://medium.com/@ssaurel/implement-the-adapter-design-pattern-in-java-f9adb6a8828f - without

---

## IAdvancedMediaPlayer Interface
 #### Methods:
 - play(Media media)

## IMediaPlayer Interface
 #### Methods:
 - play(Media media)

---

## MediaFormat Enum
 // MP3, MP4, VLC

## Media Class
 #### Attributes:
 - FileName String
 - FileFormat String

## VlcPlayer Class implements IAdvancedMediaPlayer
 #### Methods:
 - play(Media media)

## Mp4Player Class implements IAdvancedMediaPlayer
 #### Methods:
 - play(Media media)

## MediaAdapter Class implements IMediaPlayer
 // ADAPTER CLASS
 #### Attributes:
 - advancedMediaPlayer IAdvancedMediaPlayer
 #### Methods:
 - play(Media media)
 - MediaAdapter(MediaFormat format) \
 // constructor - creates IAdvancedMediaPlayer object by format

## AudioPlayer Class implements IMediaPlayer
 // Only able to mp3 formats
 #### Attributes:
 - mediaAdapter MediaAdapter
 #### Methods:
 - play(Media media)

---

# Use Adapter Pattern