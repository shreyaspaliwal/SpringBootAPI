package com.example.demo.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController
{
    @RequestMapping("/topics")
    public List<Topic> getAllTopics()
    {
        return Arrays.asList(
                new Topic("spring","Spring Framework","Spring framework description"),
                new Topic("springboot","Spring Boot","Spring Boot description"),
                new Topic("flask","Python Flask Framework","Python Flask web framework description")
        );
    }
}
