package com.hang.cloud.service.kafka.consumer.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * kafka 监听类
 *
 * @author Hang W
 */
@Component
public class KafkaService {

    private final static Logger logger = LoggerFactory.getLogger(KafkaService.class);

    /**
     * 监听topic消息
     *
     * @param consumerRecord
     */
    @KafkaListener(topics = {"topic_user"}, groupId = "user_group")
    public void consumer(ConsumerRecord consumerRecord) {
        logger.info("KafkaService.consumer START.");
        try {
            Optional<?> kafkaMessage = Optional.ofNullable(consumerRecord.value());
            if (kafkaMessage.isPresent()) {
                Object message = kafkaMessage.get();
                logger.info("KafkaService.consumer message: {}", message);
            }
        } catch (Exception e) {
            logger.info("KafkaService.consumer EXCEPTION: {}", e);
        }
        logger.info("KafkaService.consumer END.");
    }
}
