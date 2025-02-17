package com.xworkz.myMusicApp.repository;

import com.xworkz.myMusicApp.entity.Music;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicRepository extends JpaRepository<Music,Integer> {
}
