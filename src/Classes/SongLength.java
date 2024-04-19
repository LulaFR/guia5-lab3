package Classes;

public class SongLength {
    private Integer minutes;
    private Integer seconds;

    public SongLength(Integer minutes, Integer seconds) {
        this.minutes = minutes;
        this.seconds = seconds;
    }

    @Override
    public String toString() {
        return "{" + minutes + ":" + seconds + '}';
    }
}
