package com.siva.demy.photoapp.discovery;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/eurekas")
public class EurekasController {
    @Autowired
    private Environment environment;

    @GetMapping(value = "/status/check")
    public String getUsers() {
        return "USER Name is " + environment.getProperty("spring.security.user.name") + " and \ndefault zone is " + environment.getProperty("eureka.client.serviceUrl.defaultZone");
    }
}
