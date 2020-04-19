package com.hang.cloud.service.kafka.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;

/**
 * kafka 消息发送类
 *
 * @author Hang W
 */
@Component
public class KafkaService {

    private final static Logger logger = LoggerFactory.getLogger(KafkaService.class);

    @Autowired
    private KafkaTemplate kafkaTemplate;

    /**
     * 发送kafka消息到topic
     *
     * @param message
     */
    public void send(Object message) {
        logger.info("KafkaService.send START: {}", message);
        ListenableFuture future = kafkaTemplate.send("topic_user", message);
        future.addCallback(success -> {
            logger.info("KafkaService.send END: {}", message);
        }, fail -> {
            logger.info("KafkaService.send FAIL: {}", message);
        });
    }
}
