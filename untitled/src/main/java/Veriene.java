import java.util.ArrayList;
import java.util.List;

public class Veriene {
    int id;
    String stadt;
    String name;
    List<Spieler> spielers;

    public Veriene(int id, String stadt, String name) {
        this.id = id;
        this.stadt = stadt;
        this.name = name;
        this.spielers = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStadt() {
        return stadt;
    }

    public void setStadt(String stadt) {
        this.stadt = stadt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Spieler> getSpielers() {
        return spielers;
    }

    public void setSpielers(List<Spieler> spielers) {
        this.spielers = spielers;
    }
}
