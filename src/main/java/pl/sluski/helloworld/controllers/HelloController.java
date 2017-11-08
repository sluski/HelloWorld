package pl.sluski.helloworld.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Sluski
 */

@RestController
public class HelloController {
    
    @RequestMapping("/hello")
    public String sayHello(){
        return "Hello world!";
    }
    
}
