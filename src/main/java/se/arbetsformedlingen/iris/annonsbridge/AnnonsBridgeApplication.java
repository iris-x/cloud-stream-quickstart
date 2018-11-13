package se.arbetsformedlingen.iris.annonsbridge;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
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
@EnableBinding(AnnonsTopicBinding.class)
public class AnnonsBridgeApplication {



    @Component
    public static class AnnonsEventSource implements ApplicationRunner {

        @Autowired
        private AnnonsData annonsData;

        @Autowired
        private AnnonsProducer annonsProducer;

        @Override
        public void run(ApplicationArguments args) throws Exception {
            Annons annons = annonsData.getAnnons();

            Runnable runnable = () -> { annonsProducer.sendAnnons(); };
            //Executors.newScheduledThreadPool(1).scheduleAtFixedRate(runnable, 1,1, TimeUnit.SECONDS);

        }

    }

    public static void main(String[] args) throws JMSException {
		SpringApplication.run(AnnonsBridgeApplication.class, args);
	}

}
