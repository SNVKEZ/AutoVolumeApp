package ru.belous.AutoVolume;

public class TonerWorker implements Work {

    private TonerWorker(){}
    public static TonerWorker getTonerWorker(){
        return new TonerWorker();
    }
    public void doMyInit(){
        System.out.println("init");
    }
    public void doDestroy(){
        System.out.println("destroy");
    }
    @Override
    public String getTimeWork() {
        return "процесс тонировки займет 1 час";
    }
}
