package business.instructor;

import core.logging.Logger;
import dataAccess.instructor.InstructorDao;
import entities.Instructor;

public class InstructorManager {
    private Instructor instructor;
    private InstructorDao instructorDao;
    private Logger[] loggers;

    public InstructorManager( InstructorDao instructorDao, Logger[] loggers) {
        this.instructorDao = instructorDao;
        this.loggers = loggers;
    }
    public void add(Instructor instructor){
        if (instructor.getFirstName()==instructorDao.getById(instructor.getId()).getFirstName()){
            System.out.println("Aynı isimde eğitmen eklenemez.");
        }else
            instructorDao.add(instructor);
            log(" Eğitmen eklendi.");

    }

    public void delete(Instructor instructor){
        if (instructor==instructorDao.getById(instructor.getId())){
            instructorDao.delete(instructor);
            log(" Eğitmen silindi.");
        }else
            System.out.println(instructor.getFirstName() + "isimde bir kayıt bulunamadı.");
    }

    public void update(Instructor instructor) {
        if (instructor == instructorDao.getById(instructor.getId())) {
            instructorDao.update(instructor);
            log(" Eğitmen güncellendi.");
        } else
            System.out.println(instructor.getFirstName() + "isimde bir kayıt bulunamadı.");

    }
    void log(String message){
        for (Logger logger:loggers){
            logger.log(message);
        }
    }
}
