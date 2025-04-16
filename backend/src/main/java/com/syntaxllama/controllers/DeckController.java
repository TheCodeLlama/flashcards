package com.syntaxllama.controllers;

import com.syntaxllama.entities.Deck;
import com.syntaxllama.entities.User;
import com.syntaxllama.services.DeckService;
import com.syntaxllama.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/decks")
@RequiredArgsConstructor
public class DeckController {

    private final DeckService deckService;
    private final UserService userService;

    @PostMapping("/create")
    public ResponseEntity<?> createDeck(@RequestParam String firebaseUid,
                                        @RequestParam String title,
                                        @RequestParam String description,
                                        @RequestParam(defaultValue = "false") boolean isPublic) {
        Optional<User> ownerOpt = userService.findByFirebaseUid(firebaseUid);
        if (ownerOpt.isEmpty()) {
            return ResponseEntity.badRequest().body("User not found");
        }
        Deck deck = deckService.createDeck(ownerOpt.get(), title, description, isPublic);
        return ResponseEntity.ok(deck);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getDeck(@PathVariable("id") UUID deckId) {
        Optional<Deck> deckOpt = deckService.findDeckById(deckId);
        return deckOpt.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // TODO: Additional endpoints for updating, deleting, cloning, rating, etc.
}
