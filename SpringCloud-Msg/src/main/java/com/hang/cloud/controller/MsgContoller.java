package com.hang.cloud.controller;

import com.hang.cloud.service.kafka.producer.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("msg")
public class MsgContoller {

    @Autowired
    private KafkaService kafkaService;

    @GetMapping("{msg}")
    public void send(@PathVariable String msg) {
        kafkaService.send(msg);
    }

}
