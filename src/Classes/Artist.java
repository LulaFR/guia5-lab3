package Classes;

public class Artist {
    private String name;
    private Integer age;
    private String nationality;

    public Artist(String name, Integer age, String nationality) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return name +
                "\n\tAge: " + age +
                "\n\tNationality: " + nationality;
    }
}
