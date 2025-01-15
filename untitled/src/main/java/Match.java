public class Match {
    int id;
    String team1;
    String team2;
    String datum;
    String ort;
    int Kapazitat;

    public Match(int id, String team1, String team2, String datum, String ort, int kapazitat) {
        this.id = id;
        this.team1 = team1;
        this.team2 = team2;
        this.datum = datum;
        this.ort = ort;
        Kapazitat = kapazitat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTeam1() {
        return team1;
    }

    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    public String getTeam2() {
        return team2;
    }

    public void setTeam2(String team2) {
        this.team2 = team2;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public int getKapazitat() {
        return Kapazitat;
    }

    public void setKapazitat(int kapazitat) {
        Kapazitat = kapazitat;
    }
}
