package ru.belous.AutoVolume;

public class TonerWorker implements Work {
    @Override
    public String getTimeWork() {
        return "процесс тонировки займет 1 час";
    }
}
