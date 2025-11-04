package io.grundner.hellok8s;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public final class HelloK8sController {

    @GetMapping("/")
    public String helloK8s() {
        return HelloK8sLiteral.HELLO_K8S;
    }
}
