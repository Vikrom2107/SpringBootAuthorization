package ru.netology.springbootauthorization.controller;

import ru.netology.springbootauthorization.authorities.Authorities;
import ru.netology.springbootauthorization.service.AuthorizationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class AuthorizationController {
    final AuthorizationService service;

    public AuthorizationController(AuthorizationService service) {
        this.service = service;
    }

    //пример запроса http://localhost:8080/authorize?user=test&password=qwe123
    @GetMapping("/authorize")
    public List<Authorities> getAuthorities(@RequestParam("user") String user, @RequestParam("password") String password) {
        return service.getAuthorities(user, password);
    }
}
