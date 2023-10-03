package com.javacoding.redissession.controllers;


import jakarta.servlet.http.HttpSession;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class SessionController {

    @GetMapping("/write")
    public ResponseEntity<String> writeSession(@RequestParam String key, @RequestParam String value
            , HttpSession session) {
        session.setAttribute(key, value);
        return ResponseEntity.ok("Cart updated!");
    }

    @GetMapping("/read")
    public ResponseEntity<String> readSession(@RequestParam String key, HttpSession session) {
        String data = (String) session.getAttribute(key);
        return ResponseEntity.ok(data);
    }
}

