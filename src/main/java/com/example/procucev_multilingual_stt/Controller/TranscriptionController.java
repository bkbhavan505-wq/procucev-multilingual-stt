package com.example.procucev_multilingual_stt.Controller;

import com.example.procucev_multilingual_stt.Entity.Transcription;
import com.example.procucev_multilingual_stt.Repository.TranscriptionRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transcriptions")
@CrossOrigin(origins = "*")
public class TranscriptionController {

    private final TranscriptionRepository repository;

    public TranscriptionController(TranscriptionRepository repository) {
        this.repository = repository;
    }

    // CREATE
    @PostMapping
    public ResponseEntity<Transcription> createTranscription(@RequestBody Transcription item) {
        if (item.getLanguage() == null || item.getLanguage().isBlank()) {
            item.setLanguage("Multilingual (EN/HI)");
        }
        return ResponseEntity.ok(repository.save(item));
    }

    // READ ALL
    @GetMapping
    public List<Transcription> getAllTranscriptions() {
        return repository.findAllByOrderByCreatedAtDesc();
    }

    // READ BY ID
    @GetMapping("/{id}")
    public ResponseEntity<Transcription> getById(@PathVariable Long id) {
        return repository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // UPDATE
    @PutMapping("/{id}")
    public ResponseEntity<Transcription> updateTranscription(
            @PathVariable Long id,
            @RequestBody Transcription updated) {
        return repository.findById(id).map(record -> {
            record.setText(updated.getText());
            if (updated.getLanguage() != null && !updated.getLanguage().isBlank()) {
                record.setLanguage(updated.getLanguage());
            }
            return ResponseEntity.ok(repository.save(record));
        }).orElse(ResponseEntity.notFound().build());
    }

    // DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTranscription(@PathVariable Long id) {
        if (!repository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        repository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}