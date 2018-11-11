package se.arbetsformedlingen.iris.annonsbridge;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import se.arbetsformedlingen.kafka.Annons;
import javax.jms.JMSException;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@SpringBootApplication
@Controller
@EnableBinding(KafkaBinding.class)
public class AnnonsBridgeApplication {

    @Component
    public static class AnnonsEventSource implements ApplicationRunner {

        private final Log log = LogFactory.getLog(getClass());

        private MessageChannel annonsOut;

        public AnnonsEventSource(KafkaBinding kafkaBinding) {
            this.annonsOut = kafkaBinding.annonsOut();
        }

        @Override
        public void run(ApplicationArguments args) throws Exception {

            List<String> annonsIdn = Arrays.asList("100001", "100002", "100003", "100004");

            Runnable runnable = () -> {

                String annonsId = annonsIdn.get(new Random().nextInt(annonsIdn.size()));

                Annons annons = new Annons(annonsId, "Rubrik", "Annonstext");

                log.info(annons.getAnnonsId());

                Message<Annons> message = MessageBuilder.withPayload(annons)
                        .setHeader(KafkaHeaders.MESSAGE_KEY, annons.getAnnonsId().getBytes()).build();

                try {
                    log.info("Sending message:" + message.toString());
                    this.annonsOut.send(message);

                } catch (Exception e) {
                    log.error(e);
                }

            };

            Executors.newScheduledThreadPool(1).scheduleAtFixedRate(runnable, 1,1, TimeUnit.SECONDS);

        }
    }

    public static void main(String[] args) throws JMSException {
		SpringApplication.run(AnnonsBridgeApplication.class, args);
	}

}

@Component
interface KafkaBinding {

    String ANNONS_OUT = "annons_output";

    @Output(ANNONS_OUT)
    MessageChannel annonsOut();
}
