package ru.belous.AutoVolume;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        TonerWorker tonerWorker = xmlApplicationContext.getBean("tonerWorker",TonerWorker.class);
        new Worker(tonerWorker).doWork();
        System.out.println(tonerWorker.getTimeWork());
        
        // Work work = xmlApplicationContext.getBean("workBean",SoundInstall.class);
        // Worker worker = new Worker(work);
        /*Worker worker = xmlApplicationContext.getBean("workerBean", Worker.class);
        Worker worker1 = xmlApplicationContext.getBean("workerBean", Worker.class);
        worker.doWork();
        worker1.setName("Alexei");
        worker1.setAge(22);
        worker1.doWork();
        System.out.println(worker+" "+worker1);
        System.out.println(worker.getName()+" ; "+worker.getAge());
        System.out.println(worker1.getName());*/
        xmlApplicationContext.close();
    }
}
