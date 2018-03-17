package practice5jpa.data;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import practice5jpa.Lecture;

@Repository
@Transactional
public class LecturesDaoImpl implements LecturesDao{
    @PersistenceContext
    private EntityManager em;

    public Lecture addLecture(Lecture lecture) {
        em.persist(lecture);
        return lecture;
    }

    public Lecture getLecture(int id) {
        return em.find(Lecture.class,id);
    }

    public void saveLecture(Lecture lecture) {
        em.merge(lecture);
    }
}