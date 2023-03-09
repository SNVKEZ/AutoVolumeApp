package ru.belous.AutoVolume;

public class Worker {
    private final Work work;

    public Worker(Work work){
        this.work=work;
    }

    public void doWork(){
        System.out.println("Уважаемый клиент, "+ work.getTimeWork());

    }
}
