package com.practice.kafka.kafkaexample.resource;

import com.practice.kafka.kafkaexample.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
public class UserResource {

    // same as Rest Template
//    @Autowired // constructor injection
//    KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    KafkaTemplate<String, User> kafkaTemplate2;

    private static String TOPIC = "KAFKA_EXAMPLE";

//    @GetMapping("/publish/{message}")
//    public String publish(@PathVariable ("message") String msg){
//        System.out.println("message "+msg);
//        kafkaTemplate.send(TOPIC, msg);
//        return "published successfully";
//    }

//     this will be a json message, so need to do some config
    @GetMapping("/publish/{name}")
    public String publishUser(@PathVariable ("name") String name){
        System.out.println("name "+name);
        kafkaTemplate2.send(TOPIC, new User(name, "IT", 1200000 ));
        return "user published successfully";
    }

}
