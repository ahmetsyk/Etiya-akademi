package dataAccess.course;

import entities.Course;
import entities.Instructor;

import java.util.ArrayList;
import java.util.List;

public class HibernateCourseDao implements CourseDao {
    List<Course> courses = new ArrayList<>();

    public HibernateCourseDao() {
        System.out.println("Hibernate: ");

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
