package bb.net.depinj.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String SayHello(){
        System.out.println("Say something..");
        return "Hi folks";
    }
}
