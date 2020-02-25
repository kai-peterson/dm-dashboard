package com.example.dmdashboard;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AudioClipsController {

    private final AudioClipsRepository repository;

    AudioClipsController(AudioClipsRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/clips")
    List<AudioClip> all() {
        return repository.findAll();
    }

    @PostMapping("/clips")
    AudioClip newClip(@RequestBody AudioClip newClip) {
        return repository.save(newClip);
    }

    @GetMapping("/clips/{id}")
    Optional<AudioClip> clip(@PathVariable Long id) {
        return repository.findById(id);
    }

    @PutMapping("/clips/{id}")
    Optional<AudioClip> editClipInfo(@RequestBody AudioClip newAudioClip, @PathVariable Long id) {
        return repository.findById(id)
                .map(clip -> {
                    clip.setLink(newAudioClip.getLink());
                    clip.setDescription(newAudioClip.getDescription());
                    return repository.save(clip);
                });
    }

    @DeleteMapping("/clips/{id}")
    void deleteClip(@PathVariable Long id) {
        repository.deleteById(id);
    }

}
