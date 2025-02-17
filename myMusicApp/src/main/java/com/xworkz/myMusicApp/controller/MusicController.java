package com.xworkz.myMusicApp.controller;

import com.xworkz.myMusicApp.entity.Music;
import com.xworkz.myMusicApp.service.MusicService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MusicController {

   private final MusicService musicService;

    public MusicController(MusicService musicService) {
        this.musicService = musicService;
    }

    @PostMapping("/addMusic")
    String acceptMusic(@ModelAttribute Music music){
        musicService.save(music);
        return "redirect:/";
    }

    @GetMapping("/musicList")
    public String getAllMusic(Model model){
        List<Music> ref = musicService.getAllMusic();
        model.addAttribute("musicList" , ref);
        return "musicList";
        }

    @GetMapping("/delete/{id}")
    public String deleteMusic(@PathVariable Integer id){
        musicService.delete(id);
        return "redirect:/musicList";
    }

}
