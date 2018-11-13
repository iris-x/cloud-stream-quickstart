package se.arbetsformedlingen.iris.annonsbridge;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;
import se.arbetsformedlingen.kafka.Annons;


@EnableBinding(AnnonsTopicBinding.class)
@Component
public class AnnonsProducer {

    private final Log log = LogFactory.getLog(getClass());

    @Autowired
    private AnnonsTopicBinding annonsTopicBinding;

    @Autowired
    private AnnonsData annonsData;

    public void sendAnnons(Annons annons) {


        Message<Annons> message = MessageBuilder.withPayload(annons)
                .setHeader(KafkaHeaders.MESSAGE_KEY, annons.getAnnonsId().getBytes()).build();

        try {
            log.info("Sending message:" + message.toString());
            annonsTopicBinding.output().send(message);

        } catch (Exception e) {
            log.error(e);
        }
    }

    public void sendAnnons() {

        Annons annons = annonsData.getAnnons();

        Message<Annons> message = MessageBuilder.withPayload(annons)
                .setHeader(KafkaHeaders.MESSAGE_KEY, annons.getAnnonsId().getBytes()).build();

        try {
            log.info("Sending message:" + message.toString());
            annonsTopicBinding.output().send(message);

        } catch (Exception e) {
            log.error(e);
        }
    }

}

@Component
interface AnnonsTopicBinding {

    String ANNONS_OUT = "annons_output";

    @Output(ANNONS_OUT)
    MessageChannel output();
}

