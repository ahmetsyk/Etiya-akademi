package business.course;

import core.logging.Logger;
import dataAccess.course.CourseDao;
import entities.Course;
import entities.Instructor;

public class CourseManager {
    private Course course;
    private CourseDao courseDao;
    private Logger[] loggers;

    public CourseManager( CourseDao courseDao, Logger[] loggers) {

        this.courseDao = courseDao;
        this.loggers = loggers;
    }
    public void add(Course course){
        if (course.getCourseName()==courseDao.getById(course.getCourseId()).getCourseName() && course.getCoursePrice()<0){
            System.out.println("Kurs eklenemez.");
        }else
            courseDao.add(course);
            log(" Kurs eklendi");

    }

    public void delete(Course course){
        if (course==courseDao.getById(course.getCourseId())){
            courseDao.delete(course);
            log(" Kurs silindi.");
        }else
            System.out.println(course.getCourseName() + "isimde bir kayıt bulunamadı.");
    }

    public void update(Course course) {
        if (course == courseDao.getById(course.getCourseId()) && !(course.getCoursePrice() <0)) {
            courseDao.update(course);
            log(" Kurs güncellendi.");
        }
        if (course.getCoursePrice()<0){
            System.out.println("Kurs fiyatı 0 dan küçük olamaz.");
        }
        else
            System.out.println(course.getCourseName() + "isimde bir kayıt bulunamadı.");

    }
    void log(String message){
        for (Logger logger: loggers){
            logger.log(message);
        }
    }
}
