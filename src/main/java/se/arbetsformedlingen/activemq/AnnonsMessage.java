package se.arbetsformedlingen.activemq;

public class AnnonsMessage {

    private String version;
    private Annons annons;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Annons getAnnons() {
        return annons;
    }

    public void setAnnons(Annons annons) {
        this.annons = annons;
    }

    @Override
    public String toString() {
        return "AnnonsMessage{" +
                "version='" + version + '\'' +
                ", annons=" + annons +
                '}';
    }
}
