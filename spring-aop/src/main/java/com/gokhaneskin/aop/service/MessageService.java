package com.gokhaneskin.aop.service;

import org.springframework.stereotype.Service;

@Service
public class MessageService {

    public String getMessage(String message){
        System.out.println("getMessage : "+message);
        return message;
    }
}
