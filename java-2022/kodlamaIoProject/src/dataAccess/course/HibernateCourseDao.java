package dataAccess.course;

import entities.Course;

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
       for (Course course:courses){
           if (course.getCourseId()==id){
               return  course;
           }
       }
       return null;
    }

    @Override
    public List<Course> getAll() {
        return courses;
    }
}
