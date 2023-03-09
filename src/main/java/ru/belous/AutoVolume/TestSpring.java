package ru.belous.AutoVolume;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Work work = xmlApplicationContext.getBean("workBean",SoundInstall.class);
        Worker worker = new Worker(work);
        worker.doWork();
        xmlApplicationContext.close();
    }
}
