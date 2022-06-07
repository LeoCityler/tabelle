package dhbw.tabelle;

public class schueler {

    String vorname, nachname, geschlecht, kurs, unternehmen;
    int vorkenntnisse;

    public schueler(String vorname, String nachname, String geschlecht, String kurs, String unternehmen, int vorkenntnisse) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.geschlecht = geschlecht;
        this.kurs = kurs;
        this.unternehmen = unternehmen;
        this.vorkenntnisse = vorkenntnisse;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getGeschlecht() {
        return geschlecht;
    }

    public void setGeschlecht(String geschlecht) {
        this.geschlecht = geschlecht;
    }

    public String getKurs() {
        return kurs;
    }

    public void setKurs(String kurs) {
        this.kurs = kurs;
    }

    public String getUnternehmen() {
        return unternehmen;
    }

    public void setUnternehmen(String unternehmen) {
        this.unternehmen = unternehmen;
    }

    public int getVorkenntnisse() {
        return vorkenntnisse;
    }

    public void setVorkenntnisse(int vorkenntnisse) {
        this.vorkenntnisse = vorkenntnisse;
    }


}
