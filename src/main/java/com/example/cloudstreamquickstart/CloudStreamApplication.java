package com.example.cloudstreamquickstart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.JMSException;
import javax.jms.Queue;
import javax.jms.Topic;
import java.util.Arrays;
import java.util.Date;

@SpringBootApplication
@EnableJms
@RestController
@RequestMapping("/")
public class CloudStreamApplication {

    /*
    @Autowired
    private JmsTemplate jmsTemplate;

    @Autowired
    private Topic topic;

    @GetMapping("/{message}")
    public String publish(@PathVariable("message") String message) {
        System.out.println(message);

        String jsonMessage = "{ \"name\" : message}";
        jmsTemplate.convertAndSend(topic, message);
        return message;
    }
    */

	public static void main(String[] args) throws JMSException {
		SpringApplication.run(CloudStreamApplication.class, args);

	}

}

