package com.example.dmdashboard.repository;

import com.example.dmdashboard.model.AudioClip;
import org.springframework.data.repository.CrudRepository;

public interface AudioClipsRepository extends CrudRepository<AudioClip, Long> {
}
