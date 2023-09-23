package dataAccess.course;

import entities.Course;

import java.util.List;

public interface CourseDao {
    void add(Course course);
    void delete(Course course);
    void update(Course course);
    Course getById(int id);
    List<Course> getAll();

}
