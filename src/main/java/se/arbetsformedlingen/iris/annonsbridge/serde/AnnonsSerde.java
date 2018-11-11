package se.arbetsformedlingen.iris.annonsbridge.serde;

import se.arbetsformedlingen.kafka.Annons;
import io.confluent.kafka.serializers.AbstractKafkaAvroSerDeConfig;
import io.confluent.kafka.streams.serdes.avro.SpecificAvroSerializer;
import java.util.Collections;
import java.util.Map;

public class AnnonsSerde extends SpecificAvroSerializer<Annons> {

    @Override
    public void configure(Map<String, ?> serializerConfig, boolean isSerializerForRecordKeys) {
        final Map<String, String> serdeConfig = Collections.singletonMap(
                AbstractKafkaAvroSerDeConfig.SCHEMA_REGISTRY_URL_CONFIG, "http://omegateam.se:8081");
        super.configure(serdeConfig, isSerializerForRecordKeys);
    }
}

