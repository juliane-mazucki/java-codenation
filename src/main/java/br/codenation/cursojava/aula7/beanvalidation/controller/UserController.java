package br.codenation.cursojava.aula7.beanvalidation.controller;

import br.codenation.cursojava.aula7.beanvalidation.model.User;
import br.codenation.cursojava.aula7.beanvalidation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class UserController {

    @Autowired
    private UserRepository repository;

    @PostMapping("/users")
    ResponseEntity<String> addUser(@Valid @RequestBody User user) {
        repository.save(user);
        return ResponseEntity.ok("User is valid");
    }
}
