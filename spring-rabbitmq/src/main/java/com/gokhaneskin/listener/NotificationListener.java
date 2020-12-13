package com.gokhaneskin.listener;

import com.gokhaneskin.model.Notification;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationListener {

    @RabbitListener(queues = "gokhan-eskin-queue")
    public void handleMessage(Notification notification){
        System.out.println("Message recieved");
        System.out.println(notification.toString());
    }
}
