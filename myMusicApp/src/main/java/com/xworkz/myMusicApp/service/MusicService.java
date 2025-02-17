package com.xworkz.myMusicApp.service;

import com.xworkz.myMusicApp.entity.Music;
import com.xworkz.myMusicApp.repository.MusicRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicService {
   private final MusicRepository musicRepository ;

    public MusicService(MusicRepository musicRepository) {
        this.musicRepository = musicRepository;
    }



    public void save(Music music) {
        musicRepository.save(music);
    }

    public List<Music> getAllMusic() {
        return musicRepository.findAll();
    }
    public void delete(Integer id) {
        musicRepository.deleteById(id);
    }



}
