package com.example.cloudstreamquickstart;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.TextMessage;

@Component
public class Listener {

    @JmsListener(destination = "Consumer.IRIS.VirtualTopic.la.ledigtarbete.andring")
    public void receiveMessageFromTopic(final Message message) throws JMSException {
        String messageData = null;
        System.out.println("Received message " + message);

        if(message instanceof TextMessage) {
            TextMessage textMessage = (TextMessage) message;
            messageData = textMessage.getText();
        }
         System.exit(0);
    }

}
