package se.arbetsformedlingen.iris.annonsbridge;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.support.converter.MappingJackson2MessageConverter;
import org.springframework.jms.support.converter.MessageConversionException;

import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Session;
import javax.jms.TextMessage;

import static java.nio.charset.StandardCharsets.UTF_8;

@Component
public class JsonMessageConverter extends MappingJackson2MessageConverter implements MessageConverter {

    @Autowired
    private ObjectMapper mapper;

    @Override
    protected JavaType getJavaTypeForMessage(javax.jms.Message message) throws JMSException {
        return TypeFactory.defaultInstance().constructType(String.class);
    }

    /**
     * Extracts JSON payload for further processing by JacksonMapper.
     */
    @Override
    public Object fromMessage(javax.jms.Message message) throws JMSException, MessageConversionException {
        System.out.println("**************************************************************************");

        String msgBody = ((TextMessage) message).getText();

        System.out.println(msgBody);
        System.out.println("**************************************************************************");
        return msgBody;
    }
}