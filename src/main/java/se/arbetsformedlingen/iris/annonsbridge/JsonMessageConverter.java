package se.arbetsformedlingen.iris.annonsbridge;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.support.converter.MappingJackson2MessageConverter;
import org.springframework.jms.support.converter.MessageConversionException;

import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;
import se.arbetsformedlingen.activemq.AnnonsMessage;
import se.arbetsformedlingen.kafka.Annons;

import javax.jms.JMSException;
import javax.jms.Session;
import javax.jms.TextMessage;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import static java.nio.charset.StandardCharsets.UTF_8;

@Component
public class JsonMessageConverter extends MappingJackson2MessageConverter implements MessageConverter {

    private ObjectMapper objectMapper = getObjectMapper();

    @Autowired
    private AnnonsProducer annonsProducer;

    @Override
    protected JavaType getJavaTypeForMessage(javax.jms.Message message) throws JMSException {
        return TypeFactory.defaultInstance().constructType(String.class);
    }

    /**
     * Extracts JSON payload for further processing by JacksonMapper.
     *
     * TODO Skickandet av meddelanden borde flyttas till Listener
     */
    @Override
    public Object fromMessage(javax.jms.Message message) throws JMSException, MessageConversionException {
        System.out.println("**************************************************************************");

        String msgBody = ((TextMessage) message).getText();

        try {
            AnnonsMessage activeMQAnnons = objectMapper.readValue(msgBody, AnnonsMessage.class);

            Annons annons = new Annons();
            annons.setAnnonsId(activeMQAnnons.getAnnons().getAnnonsId());
            annons.setRubrik(activeMQAnnons.getAnnons().getAnnonsrubrik());
            annons.setText(activeMQAnnons.getAnnons().getAnnonstext());

            annonsProducer.sendAnnons(annons);
            System.out.println(annons);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //System.out.println(msgBody);
        System.out.println("**************************************************************************");
        return msgBody;
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