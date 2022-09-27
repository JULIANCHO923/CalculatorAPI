package com.devops.CalculatorAPI.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.net.InetAddress;

@RestController
@RequestMapping("/")
public class InfoController {

    @RequestMapping(value="/healthcheck",method = RequestMethod.GET)
    public ResponseEntity<String> healthcheck(){
        try {
            InetAddress address = InetAddress.getLocalHost();            
            return ResponseEntity.status(200).body("<html><body><title>"+address.getHostAddress()+"</title> <h1>Welcome to API Calculator</h1> <h2>Container IP:"+ address.getHostAddress() +"</h2> <br/> <h3>" + address.getHostName() +"</h3></body></html> ");
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(500).body("Error getting the ip");
        }
    }
}