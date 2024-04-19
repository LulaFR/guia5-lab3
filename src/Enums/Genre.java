package Enums;

public enum Genre {
    ROCK(0, "Rock"),
    TRAP(1, "Trap"),
    JAZZ(2, "Jazz"),
    HIPHOP(3, "Hip hop"),
    KPOP(4, "kpop"),
    METAL(5, "Metal"),
    CLASSICAL(6, "Classical");

    Integer id;
    String type;

    Genre(Integer id, String type) {
        this.id = id;
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return id + "/" + type;
    }
}
