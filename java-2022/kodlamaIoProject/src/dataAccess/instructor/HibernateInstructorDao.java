package dataAccess.instructor;

import entities.Instructor;

import java.util.ArrayList;
import java.util.List;

public class HibernateInstructorDao implements InstructorDao{
    List<Instructor> instructors = new ArrayList<>();

    public HibernateInstructorDao() {
        System.out.println("Hibernate: ");
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
        for (Instructor instructor:instructors){
            if (instructor.getId()==id){
                return instructor;
            }
        }
        return null;
    }

    @Override
    public List<Instructor> getAll() {
        return instructors;
    }
}
