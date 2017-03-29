package com.grinyov.pingutil.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

/**
 * Created by grinyov on 28.02.17.
 */
@Controller
public class HostWSController {

    private final Logger logger = LoggerFactory.getLogger(HostWSController.class);

    @Autowired
    SimpMessagingTemplate template;

//    @Scheduled(fixedDelay = 20000L)
//    @SendTo("/topic/pings)
//    public sendPong() {
//        template.convertAndSend("/topic/pings", "pong (periodic)");
//    }

    @MessageMapping("/pings")
    @SendTo("/topic/pings")
    public String sendPingResponse() {
        return "pong (response)";
    }
}
