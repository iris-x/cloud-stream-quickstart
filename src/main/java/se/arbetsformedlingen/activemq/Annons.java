package se.arbetsformedlingen.activemq;

import java.util.Date;
import java.util.List;

public class Annons {

    private String annonsId;
    private String annonsrubrik;
    private String annonstext;
    private List<Kontaktperson> kontaktpersoner;
    private Adress arbetsplatsadress;
    private Adress besoksadress;
    private Date publiceringsdatum;
    private Date sistaPubliceringsdatum;
    private Date sistaAnsokningsdatum;
    private Date statusdatum;
    private String status;
    private String informationAnsokningssatt;
    private String webbadress;
    private String villkorsbeskrivning;
    private Long antalPlatser;
    private Boolean publiceringskanalPlatsbanken;
    private Boolean publiceringskanalPlatsjournalen;
    private Boolean publiceringskanalAis;
    private Varde anstallningTyp;
    private Varde varaktighetTyp;
    private Varde arbetstidTyp;
    private Long arbetstidOmfattningFran;
    private Varde lonTyp;
    private String lonebeskrivning;
    private String kallaTyp;
    private String organisationsnummer;
    private String arbetsgivareId;
    private String arbetsgivareNamn;
    private String arbetsplatsId;
    private String arbetsplatsNamn;
    private String anvandarId;
    private String skapadAv;
    private String uppdateradAv;
    private String ansokningssattEpost;
    private Boolean ansokningssattViaAF;
    private Date inskickadTid;
    private Date skapadTid;
    private Date uppdateradTid;
    private Varde yrkesroll;
    private Boolean ingenErfarenhetKravs;
    private Boolean tillgangTillEgenBil;
    private Boolean visaEjAntalPlatser;
    private Boolean visaEjArbetsgivare;
    private Boolean visaEjArbetsplatsAdress;
    private String externtAnnonsId;
    private List<Varde> korkort;
    private List<Yrkeserfarenhet> yrkeserfarenheter;
    private List<Kompetens> kompetenser;
    private List<Varde> sprak;

    public String getAnnonsId() {
        return annonsId;
    }

    public void setAnnonsId(String annonsId) {
        this.annonsId = annonsId;
    }

    public String getAnnonsrubrik() {
        return annonsrubrik;
    }

    public void setAnnonsrubrik(String annonsrubrik) {
        this.annonsrubrik = annonsrubrik;
    }

    public String getAnnonstext() {
        return annonstext;
    }

    public void setAnnonstext(String annonstext) {
        this.annonstext = annonstext;
    }

    public List<Kontaktperson> getKontaktpersoner() {
        return kontaktpersoner;
    }

    public void setKontaktpersoner(List<Kontaktperson> kontaktpersoner) {
        this.kontaktpersoner = kontaktpersoner;
    }

    public Adress getArbetsplatsadress() {
        return arbetsplatsadress;
    }

    public void setArbetsplatsadress(Adress arbetsplatsadress) {
        this.arbetsplatsadress = arbetsplatsadress;
    }

    public Adress getBesoksadress() {
        return besoksadress;
    }

    public void setBesoksadress(Adress besoksadress) {
        this.besoksadress = besoksadress;
    }

    public Date getPubliceringsdatum() {
        return publiceringsdatum;
    }

    public void setPubliceringsdatum(Date publiceringsdatum) {
        this.publiceringsdatum = publiceringsdatum;
    }

    public Date getSistaPubliceringsdatum() {
        return sistaPubliceringsdatum;
    }

    public void setSistaPubliceringsdatum(Date sistaPubliceringsdatum) {
        this.sistaPubliceringsdatum = sistaPubliceringsdatum;
    }

    public Date getSistaAnsokningsdatum() {
        return sistaAnsokningsdatum;
    }

    public void setSistaAnsokningsdatum(Date sistaAnsokningsdatum) {
        this.sistaAnsokningsdatum = sistaAnsokningsdatum;
    }

    public Date getStatusdatum() {
        return statusdatum;
    }

    public void setStatusdatum(Date statusdatum) {
        this.statusdatum = statusdatum;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getInformationAnsokningssatt() {
        return informationAnsokningssatt;
    }

    public void setInformationAnsokningssatt(String informationAnsokningssatt) {
        this.informationAnsokningssatt = informationAnsokningssatt;
    }

    public String getWebbadress() {
        return webbadress;
    }

    public void setWebbadress(String webbadress) {
        this.webbadress = webbadress;
    }

    public String getVillkorsbeskrivning() {
        return villkorsbeskrivning;
    }

    public void setVillkorsbeskrivning(String villkorsbeskrivning) {
        this.villkorsbeskrivning = villkorsbeskrivning;
    }

    public Long getAntalPlatser() {
        return antalPlatser;
    }

    public void setAntalPlatser(Long antalPlatser) {
        this.antalPlatser = antalPlatser;
    }

    public Boolean getPubliceringskanalPlatsbanken() {
        return publiceringskanalPlatsbanken;
    }

    public void setPubliceringskanalPlatsbanken(Boolean publiceringskanalPlatsbanken) {
        this.publiceringskanalPlatsbanken = publiceringskanalPlatsbanken;
    }

    public Boolean getPubliceringskanalPlatsjournalen() {
        return publiceringskanalPlatsjournalen;
    }

    public void setPubliceringskanalPlatsjournalen(Boolean publiceringskanalPlatsjournalen) {
        this.publiceringskanalPlatsjournalen = publiceringskanalPlatsjournalen;
    }

    public Boolean getPubliceringskanalAis() {
        return publiceringskanalAis;
    }

    public void setPubliceringskanalAis(Boolean publiceringskanalAis) {
        this.publiceringskanalAis = publiceringskanalAis;
    }

    public Varde getAnstallningTyp() {
        return anstallningTyp;
    }

    public void setAnstallningTyp(Varde anstallningTyp) {
        this.anstallningTyp = anstallningTyp;
    }

    public Varde getVaraktighetTyp() {
        return varaktighetTyp;
    }

    public void setVaraktighetTyp(Varde varaktighetTyp) {
        this.varaktighetTyp = varaktighetTyp;
    }

    public Varde getArbetstidTyp() {
        return arbetstidTyp;
    }

    public void setArbetstidTyp(Varde arbetstidTyp) {
        this.arbetstidTyp = arbetstidTyp;
    }

    public Long getArbetstidOmfattningFran() {
        return arbetstidOmfattningFran;
    }

    public void setArbetstidOmfattningFran(Long arbetstidOmfattningFran) {
        this.arbetstidOmfattningFran = arbetstidOmfattningFran;
    }

    public Varde getLonTyp() {
        return lonTyp;
    }

    public void setLonTyp(Varde lonTyp) {
        this.lonTyp = lonTyp;
    }

    public String getLonebeskrivning() {
        return lonebeskrivning;
    }

    public void setLonebeskrivning(String lonebeskrivning) {
        this.lonebeskrivning = lonebeskrivning;
    }

    public String getKallaTyp() {
        return kallaTyp;
    }

    public void setKallaTyp(String kallaTyp) {
        this.kallaTyp = kallaTyp;
    }

    public String getOrganisationsnummer() {
        return organisationsnummer;
    }

    public void setOrganisationsnummer(String organisationsnummer) {
        this.organisationsnummer = organisationsnummer;
    }

    public String getArbetsgivareId() {
        return arbetsgivareId;
    }

    public void setArbetsgivareId(String arbetsgivareId) {
        this.arbetsgivareId = arbetsgivareId;
    }

    public String getArbetsgivareNamn() {
        return arbetsgivareNamn;
    }

    public void setArbetsgivareNamn(String arbetsgivareNamn) {
        this.arbetsgivareNamn = arbetsgivareNamn;
    }

    public String getArbetsplatsId() {
        return arbetsplatsId;
    }

    public void setArbetsplatsId(String arbetsplatsId) {
        this.arbetsplatsId = arbetsplatsId;
    }

    public String getArbetsplatsNamn() {
        return arbetsplatsNamn;
    }

    public void setArbetsplatsNamn(String arbetsplatsNamn) {
        this.arbetsplatsNamn = arbetsplatsNamn;
    }

    public String getAnvandarId() {
        return anvandarId;
    }

    public void setAnvandarId(String anvandarId) {
        this.anvandarId = anvandarId;
    }

    public String getSkapadAv() {
        return skapadAv;
    }

    public void setSkapadAv(String skapadAv) {
        this.skapadAv = skapadAv;
    }

    public String getUppdateradAv() {
        return uppdateradAv;
    }

    public void setUppdateradAv(String uppdateradAv) {
        this.uppdateradAv = uppdateradAv;
    }

    public String getAnsokningssattEpost() {
        return ansokningssattEpost;
    }

    public void setAnsokningssattEpost(String ansokningssattEpost) {
        this.ansokningssattEpost = ansokningssattEpost;
    }

    public Boolean getAnsokningssattViaAF() {
        return ansokningssattViaAF;
    }

    public void setAnsokningssattViaAF(Boolean ansokningssattViaAF) {
        this.ansokningssattViaAF = ansokningssattViaAF;
    }

    public Date getInskickadTid() {
        return inskickadTid;
    }

    public void setInskickadTid(Date inskickadTid) {
        this.inskickadTid = inskickadTid;
    }

    public Date getSkapadTid() {
        return skapadTid;
    }

    public void setSkapadTid(Date skapadTid) {
        this.skapadTid = skapadTid;
    }

    public Date getUppdateradTid() {
        return uppdateradTid;
    }

    public void setUppdateradTid(Date uppdateradTid) {
        this.uppdateradTid = uppdateradTid;
    }

    public Varde getYrkesroll() {
        return yrkesroll;
    }

    public void setYrkesroll(Varde yrkesroll) {
        this.yrkesroll = yrkesroll;
    }

    public Boolean getIngenErfarenhetKravs() {
        return ingenErfarenhetKravs;
    }

    public void setIngenErfarenhetKravs(Boolean ingenErfarenhetKravs) {
        this.ingenErfarenhetKravs = ingenErfarenhetKravs;
    }

    public Boolean getTillgangTillEgenBil() {
        return tillgangTillEgenBil;
    }

    public void setTillgangTillEgenBil(Boolean tillgangTillEgenBil) {
        this.tillgangTillEgenBil = tillgangTillEgenBil;
    }

    public Boolean getVisaEjAntalPlatser() {
        return visaEjAntalPlatser;
    }

    public void setVisaEjAntalPlatser(Boolean visaEjAntalPlatser) {
        this.visaEjAntalPlatser = visaEjAntalPlatser;
    }

    public Boolean getVisaEjArbetsgivare() {
        return visaEjArbetsgivare;
    }

    public void setVisaEjArbetsgivare(Boolean visaEjArbetsgivare) {
        this.visaEjArbetsgivare = visaEjArbetsgivare;
    }

    public Boolean getVisaEjArbetsplatsAdress() {
        return visaEjArbetsplatsAdress;
    }

    public void setVisaEjArbetsplatsAdress(Boolean visaEjArbetsplatsAdress) {
        this.visaEjArbetsplatsAdress = visaEjArbetsplatsAdress;
    }

    public String getExterntAnnonsId() {
        return externtAnnonsId;
    }

    public void setExterntAnnonsId(String externtAnnonsId) {
        this.externtAnnonsId = externtAnnonsId;
    }

    public List<Varde> getKorkort() {
        return korkort;
    }

    public void setKorkort(List<Varde> korkort) {
        this.korkort = korkort;
    }

    public List<Yrkeserfarenhet> getYrkeserfarenheter() {
        return yrkeserfarenheter;
    }

    public void setYrkeserfarenheter(List<Yrkeserfarenhet> yrkeserfarenheter) {
        this.yrkeserfarenheter = yrkeserfarenheter;
    }

    public List<Kompetens> getKompetenser() {
        return kompetenser;
    }

    public void setKompetenser(List<Kompetens> kompetenser) {
        this.kompetenser = kompetenser;
    }

    public List<Varde> getSprak() {
        return sprak;
    }

    public void setSprak(List<Varde> sprak) {
        this.sprak = sprak;
    }

    //  ", annonstext='" + annonstext.substring(0,5) + "..." + '\'' +
    @Override
    public String toString() {
        return "Annons{" +
                "annonsId='" + annonsId + '\'' +
                ", annonsrubrik='" + annonsrubrik + '\'' +
                ", annonstext='" + annonstext + '\'' +
                ", kontaktpersoner=" + kontaktpersoner +
                ", arbetsplatsadress=" + arbetsplatsadress +
                ", besoksadress=" + besoksadress +
                ", publiceringsdatum=" + publiceringsdatum +
                ", sistaPubliceringsdatum=" + sistaPubliceringsdatum +
                ", sistaAnsokningsdatum=" + sistaAnsokningsdatum +
                ", statusdatum=" + statusdatum +
                ", status='" + status + '\'' +
                //", informationAnsokningssatt='" + informationAnsokningssatt.substring(0,5) + "..." + '\'' +
                ", webbadress='" + webbadress + '\'' +
                ", villkorsbeskrivning='" + villkorsbeskrivning + '\'' +
                ", antalPlatser=" + antalPlatser +
                ", publiceringskanalPlatsbanken=" + publiceringskanalPlatsbanken +
                ", publiceringskanalPlatsjournalen=" + publiceringskanalPlatsjournalen +
                ", publiceringskanalAis=" + publiceringskanalAis +
                ", anstallningTyp=" + anstallningTyp +
                ", varaktighetTyp=" + varaktighetTyp +
                ", arbetstidTyp=" + arbetstidTyp +
                ", arbetstidOmfattningFran=" + arbetstidOmfattningFran +
                ", lonTyp=" + lonTyp +
                ", lonebeskrivning='" + lonebeskrivning + '\'' +
                ", kallaTyp='" + kallaTyp + '\'' +
                ", organisationsnummer='" + organisationsnummer + '\'' +
                ", arbetsgivareId='" + arbetsgivareId + '\'' +
                ", arbetsgivareNamn='" + arbetsgivareNamn + '\'' +
                ", arbetsplatsId='" + arbetsplatsId + '\'' +
                ", arbetsplatsNamn='" + arbetsplatsNamn + '\'' +
                ", anvandarId='" + anvandarId + '\'' +
                ", skapadAv='" + skapadAv + '\'' +
                ", uppdateradAv='" + uppdateradAv + '\'' +
                ", ansokningssattEpost='" + ansokningssattEpost + '\'' +
                ", ansokningssattViaAF=" + ansokningssattViaAF +
                ", inskickadTid=" + inskickadTid +
                ", skapadTid=" + skapadTid +
                ", uppdateradTid=" + uppdateradTid +
                ", yrkesroll=" + yrkesroll +
                ", ingenErfarenhetKravs=" + ingenErfarenhetKravs +
                ", tillgangTillEgenBil=" + tillgangTillEgenBil +
                ", visaEjAntalPlatser=" + visaEjAntalPlatser +
                ", visaEjArbetsgivare=" + visaEjArbetsgivare +
                ", visaEjArbetsplatsAdress=" + visaEjArbetsplatsAdress +
                ", externtAnnonsId='" + externtAnnonsId + '\'' +
                ", korkort=" + korkort +
                ", yrkeserfarenheter=" + yrkeserfarenheter +
                ", kompetenser=" + kompetenser +
                ", sprak=" + sprak +
                '}';
    }
}
