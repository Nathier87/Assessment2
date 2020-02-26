package com.capgemini.Assessment2.Assessment2.Controller;

import com.capgemini.Assessment2.Assessment2.Model.Topic;
import com.capgemini.Assessment2.Assessment2.Repository.TopicsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/topic")
public class TopicController {
    @Autowired
    private TopicsRepository topicsRepository;


    @GetMapping
    public List<Topic> getTopics(){
        return topicsRepository.findAll();
    }

    @PostMapping
    public void addTopic(@RequestBody Topic topic){
        topicsRepository.save(topic);
    }
}
