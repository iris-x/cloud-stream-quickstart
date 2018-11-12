package se.arbetsformedlingen.activemq;

public class Kompetens {

    private Long vikt;
    private String varde;

    public Long getVikt() {
        return vikt;
    }

    public void setVikt(Long vikt) {
        this.vikt = vikt;
    }

    public String getVarde() {
        return varde;
    }

    public void setVarde(String varde) {
        this.varde = varde;
    }

    @Override
    public String toString() {
        return "Kompetens{" +
                "vikt=" + vikt +
                ", varde='" + varde + '\'' +
                '}';
    }
}
