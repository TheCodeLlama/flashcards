package com.syntaxllama.services;

import com.syntaxllama.entities.User;
import com.syntaxllama.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User createUser(String firebaseUid, String username) {
        User user = User.builder()
                .firebaseUid(firebaseUid)
                .username(username)
                .isAdmin(false)
                .createdAt(Instant.now())
                .build();
        return userRepository.save(user);
    }

    public Optional<User> findByFirebaseUid(String firebaseUid) {
        return userRepository.findByFirebaseUid(firebaseUid);
    }

    // TODO: Additional methods for updating or querying users.
}
