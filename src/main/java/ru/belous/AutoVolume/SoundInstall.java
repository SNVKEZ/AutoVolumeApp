package ru.belous.AutoVolume;

import org.springframework.stereotype.Component;


public class SoundInstall implements Work {
    @Override
    public String getTimeWork() {
        return "установка займет 3 часа";
    }
}
