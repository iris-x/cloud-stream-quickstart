package se.arbetsformedlingen.iris.annonsbridge;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

//@Component
public class Listener {

    @JmsListener(destination = "Consumer.IRIS.VirtualTopic.la.ledigtarbete.andring")
    public void receiveMessageFromTopic(final Message message) {

        System.out.println("Received message " + message);

    }

}
