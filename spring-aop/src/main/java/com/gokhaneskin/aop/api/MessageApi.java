package com.gokhaneskin.aop.api;

import com.gokhaneskin.aop.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/message")
public class MessageApi {

    @Autowired
    private MessageService messageService;

    @PostMapping
    public ResponseEntity<String> getAll(@RequestBody String message){
        return ResponseEntity.ok(messageService.getMessage(message));
    }

}