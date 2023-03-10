package ru.belous.AutoVolume;

public class Worker {
    private Work work;
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Worker(){}
    //public Worker(Work work){this.work=work;}

    public void setWork(Work work){
        this.work=work;
    }

    public void doWork(){
        System.out.println("Уважаемый клиент, "+ work.getTimeWork());
    }


}
