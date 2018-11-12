package se.arbetsformedlingen.activemq;

public class Yrkeserfarenhet {

    private String varde;
    private Varde erfarenhetsniva;
    private Long vikt;

    public String getVarde() {
        return varde;
    }

    public void setVarde(String varde) {
        this.varde = varde;
    }

    public Varde getErfarenhetsniva() {
        return erfarenhetsniva;
    }

    public void setErfarenhetsniva(Varde erfarenhetsniva) {
        this.erfarenhetsniva = erfarenhetsniva;
    }

    public Long getVikt() {
        return vikt;
    }

    public void setVikt(Long vikt) {
        this.vikt = vikt;
    }

    @Override
    public String toString() {
        return "Yrkeserfarenhet{" +
                "varde=" + varde +
                ", erfarenhetsniva=" + erfarenhetsniva +
                ", vikt=" + vikt +
                '}';
    }
}
