package org.poc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private Environment environment;

    @GetMapping("/property")
    public String get() {
        String value = environment.getProperty("key");
        System.out.println("Returning " + value);
        return value;
    }

}
