//package com.example.frontapp.services;
//
//import com.example.frontapp.entity.OperatorAnswer;
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.amqp.rabbit.annotation.RabbitListener;
//import org.springframework.stereotype.Service;
//
//@Service
//@Slf4j
//public class RabbitListenerService {
//    @RabbitListener(queues = "queue-admin-bot")
//    public void onMessage(String answer) throws JsonProcessingException {
//        log.warn("**" + answer);
//        ObjectMapper objectMapper = new ObjectMapper();
//        OperatorAnswer operatorAnswer = objectMapper.readValue(answer, OperatorAnswer.class);
//        log.warn("**" + operatorAnswer.toString());
//    }
//}
