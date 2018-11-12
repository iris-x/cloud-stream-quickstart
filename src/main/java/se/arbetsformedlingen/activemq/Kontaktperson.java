package se.arbetsformedlingen.activemq;

public class Kontaktperson {

    private String befattning;
    private String beskrivning;
    private String telefonnummer;
    private String epost;
    private String fackligRepresentant;

    public String getBefattning() {
        return befattning;
    }

    public void setBefattning(String befattning) {
        this.befattning = befattning;
    }

    public String getBeskrivning() {
        return beskrivning;
    }

    public void setBeskrivning(String beskrivning) {
        this.beskrivning = beskrivning;
    }

    public String getTelefonnummer() {
        return telefonnummer;
    }

    public void setTelefonnummer(String telefonnummer) {
        this.telefonnummer = telefonnummer;
    }

    public String getEpost() {
        return epost;
    }

    public void setEpost(String epost) {
        this.epost = epost;
    }

    public String getFackligRepresentant() {
        return fackligRepresentant;
    }

    public void setFackligRepresentant(String fackligRepresentant) {
        this.fackligRepresentant = fackligRepresentant;
    }

    @Override
    public String toString() {
        return "Kontaktperson{" +
                "befattning='" + befattning + '\'' +
                ", beskrivning='" + beskrivning + '\'' +
                ", telefonnummer='" + telefonnummer + '\'' +
                ", epost='" + epost + '\'' +
                ", fackligRepresentant='" + fackligRepresentant + '\'' +
                '}';
    }
}
