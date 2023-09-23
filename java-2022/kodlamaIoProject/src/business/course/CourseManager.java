package business.course;

import core.logging.Logger;
import dataAccess.course.CourseDao;
import entities.Course;

public class CourseManager {
    private CourseDao courseDao;
    private Logger[] loggers;

    public CourseManager( CourseDao courseDao, Logger[] loggers) {

        this.courseDao = courseDao;
        this.loggers = loggers;
    }
    public void add(Course course){
        for (Course course1: courseDao.getAll()){
            if (course.getCourseName()==course1.getCourseName()){
                System.out.println("Kurs ismi aynı olamaz");
            }
        }
        if (course.getCoursePrice()<0){
            System.out.println("Kurs fiyatı 0'dan küçükolamaz.");
        }else
       {
            courseDao.add(course);
            log(" Kurs eklendi");
        }
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
