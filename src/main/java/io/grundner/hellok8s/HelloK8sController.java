package io.grundner.hellok8s;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloK8sController {

    @GetMapping("/")
    public String hello() {
        return "Hello K8s";
    }
}
