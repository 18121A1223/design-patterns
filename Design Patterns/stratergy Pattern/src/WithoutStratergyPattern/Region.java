package WithoutStratergyPattern;

public class Region {
    int id;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Region(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
