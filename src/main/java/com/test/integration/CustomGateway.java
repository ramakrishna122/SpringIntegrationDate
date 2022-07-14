package com.test.integration;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.stereotype.Controller;
@Controller
@MessagingGateway
public interface CustomGateway {

    @Gateway(requestChannel = "requestChannel")
    void start(String url);
}
