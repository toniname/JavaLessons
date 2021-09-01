package java_core_grom.mateAkademi.treni.forsobes.Exercise2;

public class Vertex {
    public Name name;//set the names of the vertices and mark their passage
    public boolean isVisited;

    public Vertex(Name name) {
        this.name = name;
        isVisited = false;
    }

    public Name getName() {
        return name;
    }
}
