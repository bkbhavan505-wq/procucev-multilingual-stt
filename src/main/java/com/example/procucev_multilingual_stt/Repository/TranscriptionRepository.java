package com.example.procucev_multilingual_stt.Repository;

import com.example.procucev_multilingual_stt.Entity.Transcription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TranscriptionRepository extends JpaRepository<Transcription, Long> {
    List<Transcription> findAllByOrderByCreatedAtDesc();
}