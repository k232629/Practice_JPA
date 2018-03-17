package practice5jpa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import practice5jpa.worker.LecturesWorker;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class App {

    public static void main( String[] args ) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBean.xml");
        Lecture lecture = new Lecture();
        lecture.setName("Introduction to Spring");
        lecture.setCredits(2.5);
        LecturesWorker worker = (LecturesWorker)context.getBean("worker");
        worker.addLecture(lecture);

        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("myUnit");
        EntityManager entityManager = emfactory.createEntityManager();
        Query query = entityManager.createQuery("select e.name from Lecture e");
    }

}
