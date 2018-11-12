package se.arbetsformedlingen.iris.annonsbridge;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import se.arbetsformedlingen.activemq.Annons;
import se.arbetsformedlingen.activemq.AnnonsMessage;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class AnnonsBridgeApplicationTest {

	private String jsonMessage = "{\"version\":1,\"annons\":{\"annonsId\":6511982,\"besoksadress\":{\"gatuadress\":\"Besöksadressen \"},\"postadress\":{\"gatuadress\":\"BesökPostadressen\",\"postnr\":\"74340\",\"postort\":\"Jokkmokk (fritext)\"},\"arbetsplatsadress\":{\"land\":{\"varde\":\"199\"},\"lan\":{\"varde\":\"21\"},\"kommun\":{\"varde\":\"2183\"},\"latitud\":\"61.34838\",\"longitud\":\"16.394268\"},\"kontaktpersoner\":[{\"befattning\":\"Kontaktperson2 titel\",\"telefonnummer\":\"08 22 22 22\",\"epost\":\"Kontaktperson2@epost.se\",\"fackligRepresentant\":true,\"beskrivning\":\"Namn2\"},{\"befattning\":\"Titel1\",\"telefonnummer\":\"08 11 11 11\",\"epost\":\"Kontaktperson1@epost.se\",\"fackligRepresentant\":false,\"beskrivning\":\"Kontaktperson1 Namn\"}],\"publiceringsdatum\":\"Nov 8, 2018 4:23:28 PM\",\"sistaPubliceringsdatum\":\"May 7, 2019 11:59:59 PM\",\"sistaAnsokningsdatum\":\"May 7, 2019 11:59:59 PM\",\"status\":\"GODKAND_FOR_PUBLICERING\",\"statusdatum\":\"Nov 8, 2018 4:24:21 PM\",\"annonstext\":\" Annonstext organisationsbeskrivning\\n            \\r\\n\\r\\nArbetsgivarbeskrivning - HiringOrgDescription\\n          \\r\\n\\r\\nArbetsbeskrivning - JobPositionPurpose\\r\\n\\r\\nArbetsuppgift beskrivning - JobPositionTasks\\n          \\r\\nJobbeskrivning - JobPositionDescription\\r\\n\\r\\nKvalifikationskrav - QualificationsRequired\\r\\nÖnskade kvalifikationer - Qualifications preferred\",\"informationAnsokningssatt\":\"Ansökan skickas till:\\r\\n\\r\\nAnsökansgatan 1\\r\\n\\r\\n\",\"publiceringskanalPlatsbanken\":true,\"publiceringskanalPlatsjournalen\":true,\"publiceringskanalAis\":true,\"version\":\"1.0\",\"annonsrubrik\":\"DXA till LA autotest - Arbetsort kommun - 2018-11-08 16:24:12\",\"antalPlatser\":2,\"webbadress\":\"www.arbetsgivaren.se\",\"villkorsbeskrivning\":\"Anställningstyp specifikation text\\r\\nAnställningstid specifikation text \",\"anstallningTyp\":{\"varde\":\"1\"},\"varaktighetTyp\":{\"varde\":\"2\"},\"arbetstidTyp\":{\"varde\":\"1\"},\"lonTyp\":{\"varde\":\"1\"},\"lonebeskrivning\":\"Löneförmåner övriga text\",\"kallaTyp\":\"VIA_PLATSBANKEN_DXA\",\"organisationsnummer\":\"2021002114\",\"arbetsgivareId\":\"10819829\",\"arbetsgivareNamn\":\"Arbetsförmedlingen\",\"arbetsplatsId\":\"0\",\"arbetsplatsNamn\":\"Arbetsförmedlingen\",\"anvandarId\":\"0\",\"skapadAv\":\"0\",\"inskickadTid\":\"Nov 8, 2018 4:23:28 PM\",\"skapadTid\":\"Nov 8, 2018 4:24:22 PM\",\"uppdateradAv\":\"0\",\"uppdateradTid\":\"Nov 8, 2018 4:24:21 PM\",\"ansokningssattEpost\":\"ansokan@arbetsformedlingen.se\",\"ansokningssattWebbadress\":\"www.ansökan.se\",\"ansokningssattViaAF\":false,\"externtAnnonsId\":\"46-202100-2114-DXA-LA_2018-11-08 16:24:12\",\"yrkesroll\":{\"varde\":\"5422\"},\"ingenErfarenhetKravs\":false,\"yrkeserfarenheter\":[{\"erfarenhetsniva\":{\"varde\":\"2\"},\"vikt\":10,\"varde\":\"5422\"}],\"kompetenser\":[{\"vikt\":5,\"varde\":\"2823\"}],\"tillgangTillEgenBil\":true,\"korkort\":[{\"varde\":\"3\"},{\"varde\":\"4\"}],\"sprak\":[{\"varde\":\"472\"},{\"varde\":\"292\"}],\"visaEjAntalPlatser\":false,\"visaEjArbetsgivare\":false}}";

	@Test
	public void contextLoads() {
	}

	@Test
	public void messageTest() throws IOException {

		System.out.println(jsonMessage);

        ObjectMapper objectMapper = getObjectMapper();

		AnnonsMessage annonsMessage = objectMapper.readValue(jsonMessage, AnnonsMessage.class);

		System.out.println(annonsMessage);

	}

    private ObjectMapper getObjectMapper() {

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        // "Nov 8, 2018 4:23:28 PM"
        DateFormat df = new SimpleDateFormat("MMM dd, yyyy HH:mm:ss a");
        objectMapper.setDateFormat(df);

        return objectMapper;
    }

}
