package com.example.frontapp.services;

import com.example.frontapp.entity.Answer;
import com.example.frontapp.repos.SessionRepo;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rabbitmq.client.ConnectionFactory;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.amqp.rabbit.listener.adapter.MessageListenerAdapter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@Slf4j
@RequiredArgsConstructor
public class AnswerSenderService {
    private final SessionRepo sessionRepo;

    private final RabbitTemplate template;

    @Value("${sr.rabbit.queue.name}")
    private String queueName;

    @Value("${sr.rabbit.routing.name}")
    private String routingName;

    @Value("${sr.rabbit.exchange.name}")
    private String exchangeName;

    public void sendToQueue(String answer){//produce
        log.info("sendQueue method");

        System.out.println("FRONT APP sendToQueue method ");
        ObjectMapper Obj = new ObjectMapper();
        try {
            String jsonStr = Obj.writeValueAsString(answer);
            System.out.println(jsonStr);
            template.convertAndSend(exchangeName,routingName,answer);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("-- end of the method --");

    }

}
