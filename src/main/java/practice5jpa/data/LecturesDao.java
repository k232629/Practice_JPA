package practice5jpa.data;
import practice5jpa.Lecture;


public interface LecturesDao {

    Lecture addLecture(Lecture lecture);

    Lecture getLecture(int id);

    void saveLecture(Lecture lecture);

}