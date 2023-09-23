package dataAccess.course;

import entities.Course;

public interface CourseDao {
    void add(Course course);
    void delete(Course course);
    void update(Course course);
    Course getById(int id);

}
