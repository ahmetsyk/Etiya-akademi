package dataAccess.instructor;

import entities.Instructor;

import java.util.ArrayList;
import java.util.List;

public class JdbcInstructorDao implements InstructorDao{
    List<Instructor> instructors = new ArrayList<>();

    public JdbcInstructorDao() {
        System.out.println("JDBC: ");

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
