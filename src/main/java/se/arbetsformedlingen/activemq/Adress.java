package se.arbetsformedlingen.activemq;

public class Adress {

    private String gatuadress;
    private String postnr;
    private String postort;
    private String latitud;
    private String longitud;
    private Varde land;
    private Varde lan;
    private Varde kommun;

    public Varde getLan() {
        return lan;
    }

    public void setLan(Varde lan) {
        this.lan = lan;
    }

    public Varde getKommun() {
        return kommun;
    }

    public void setKommun(Varde kommun) {
        this.kommun = kommun;
    }

    public Varde getLand() {
        return land;
    }

    public void setLand(Varde land) {
        this.land = land;
    }

    public String getGatuadress() {
        return gatuadress;
    }

    public void setGatuadress(String gatuadress) {
        this.gatuadress = gatuadress;
    }

    public String getPostnr() {
        return postnr;
    }

    public void setPostnr(String postnr) {
        this.postnr = postnr;
    }

    public String getPostort() {
        return postort;
    }

    public void setPostort(String postort) {
        this.postort = postort;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "gatuadress='" + gatuadress + '\'' +
                ", postnr='" + postnr + '\'' +
                ", postort='" + postort + '\'' +
                ", latitud='" + latitud + '\'' +
                ", longitud='" + longitud + '\'' +
                ", land='" + land + '\'' +
                ", lan='" + lan + '\'' +
                ", kommun='" + kommun + '\'' +
                '}';
    }
}
