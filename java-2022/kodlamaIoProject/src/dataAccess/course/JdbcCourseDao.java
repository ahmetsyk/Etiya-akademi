package dataAccess.course;

import entities.Course;

import java.util.ArrayList;
import java.util.List;

public class JdbcCourseDao implements CourseDao{
    List<Course> courses = new ArrayList<>();

    public JdbcCourseDao() {
        System.out.println("JDBS: ");
    }

    @Override
    public void add(Course course) {
        courses.add(course);
    }

    @Override
    public void delete(Course course) {
        courses.remove(course);
    }

    @Override
    public void update(Course course) {
        courses.set(course.getCourseId(), course);
    }

    @Override
    public Course getById(int id) {
        return courses.get(id);
    }

}
