package practice5jpa.worker;

import org.springframework.beans.factory.annotation.Autowired;
import practice5jpa.data.LecturesDao;
import practice5jpa.Lecture;

public class LecturesWorker {
    @Autowired
    LecturesDao lecturesDao;
    public Lecture addLecture(Lecture lecture){
        lecture = lecturesDao.addLecture(lecture);
        System.out.println(lecture.getId()+" "+lecture.getName()+" "+lecture.getCredits());
        return lecture;
    }
}
