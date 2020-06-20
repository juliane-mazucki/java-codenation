package br.codenation.cursojava.aula8.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/unauthenticated")
    public String unauthenticated() {
        return "unauthenticated";
    }

    @GetMapping("/adminAllowed")
    public String admin() {
        return "adminAllowed";
    }

    @GetMapping("/userAllowed")
    public String user() {
        return "userAllowed";
    }

    @GetMapping("/all")
    public String all() {
        return "all";
    }
}
