package com.capgemini.Assessment2.Assessment2.Controller;

import com.capgemini.Assessment2.Assessment2.Model.Message;
import com.capgemini.Assessment2.Assessment2.Repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/message")
public class MessageController {
    @Autowired
    private MessageRepository messageRepository;

    @GetMapping
    public List<Message> getMessages(){
        return messageRepository.findAll();
    }
    @PostMapping
    public void addMessage(@RequestBody Message message){
        messageRepository.save(message);
    }


}
