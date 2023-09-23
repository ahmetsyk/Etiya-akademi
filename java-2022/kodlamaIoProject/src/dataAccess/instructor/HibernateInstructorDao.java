package dataAccess.instructor;

import entities.Instructor;

import java.util.List;

public class HibernateInstructorDao implements InstructorDao{
    List<Instructor> instructors;

    public HibernateInstructorDao(List<Instructor> instructors) {
        System.out.println("Hibernate: ");
        this.instructors = instructors;
    }

    @Override
    public void add(Instructor instructor) {
        instructors.add(instructor);
    }

    @Override
    public void delete(Instructor instructor) {
        instructors.remove(instructor);
    }

    @Override
    public void update(Instructor instructor) {
        instructors.set(instructor.getId(), instructor);
    }

    public Instructor getById(int id){
        return instructors.get(id);
    }
}
