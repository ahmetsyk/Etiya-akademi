package dataAccess.course;

import entities.Course;
import entities.Instructor;

import java.util.List;

public class HibernateCourseDao implements CourseDao {
    List<Course> courses;

    public HibernateCourseDao(List<Course> courses) {
        System.out.println("Hibernate: ");
        this.courses = courses;
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
