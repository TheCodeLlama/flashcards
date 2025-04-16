package com.syntaxllama.controllers;

import com.syntaxllama.entities.User;
import com.syntaxllama.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/create")
    public ResponseEntity<User> createUser(@RequestParam String firebaseUid,
                                           @RequestParam String username) {
        User user = userService.createUser(firebaseUid, username);
        return ResponseEntity.ok(user);
    }

    // TODO: Other endpoints (e.g., update, fetch by firebaseUid) can be added.
}
