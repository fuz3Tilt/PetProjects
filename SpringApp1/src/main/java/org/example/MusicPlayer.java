package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class MusicPlayer {
    @Autowired
    @Qualifier("musicBean")
    private Music music;
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    //IoC

    public MusicPlayer(Music music){
        this.music = music;
    }
    public MusicPlayer(){}

    public void setMusic(Music music) {
        this.music = music;
    }
     @Override
     public String toString(){
        return music.getSong();
     }
    public void playMusic(){
        System.out.println("Playing: "+music.getSong());
    }
}
