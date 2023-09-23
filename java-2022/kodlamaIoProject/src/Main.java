import business.category.CategoryManager;
import business.course.CourseManager;
import business.instructor.InstructorManager;
import core.logging.DatebaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import dataAccess.category.HibernateCategoryDao;
import dataAccess.course.JdbcCourseDao;
import dataAccess.instructor.JdbcInstructorDao;
import entities.Category;
import entities.Course;
import entities.Instructor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Category category1 = new Category();
        category1.setCategoryId(1);
        category1.setCategoryName("Backend");

        Category category2 = new Category();
        category2.setCategoryId(2);
        category2.setCategoryName("Frontend");

        Instructor instructor = new Instructor();
        instructor.setId(1);
        instructor.setFirstName("Engin");
        instructor.setLastName("Demiroğ");

        Instructor instructor2 = new Instructor();
        instructor2.setId(2);
        instructor2.setFirstName("Halit");
        instructor2.setLastName("Kalaycı");

        Course course = new Course();
        course.setCourseId(1);
        course.setCourseName("Java");
        course.setCoursePrice(60);
        course.setCourseCategory(category1);
        course.setCourseInstructor(instructor);


        Course course2 = new Course();
        course2.setCourseId(2);
        course2.setCourseName("C#");
        course2.setCoursePrice(-20);
        course2.setCourseCategory(category1);
        course2.setCourseInstructor(instructor);


        Course course3 = new Course();
        course3.setCourseId(3);
        course3.setCourseName("HTML");
        course3.setCoursePrice(50);
        course3.setCourseCategory(category2);
        course3.setCourseInstructor(instructor2);

        Course course4 = new Course();
        course4.setCourseId(3);
        course4.setCourseName("CSS");
        course4.setCoursePrice(50);
        course4.setCourseCategory(category2);
        course4.setCourseInstructor(instructor2);


        Logger[] loggers = new Logger[]{new FileLogger(), new DatebaseLogger()};

        CourseManager courseManager = new CourseManager(new JdbcCourseDao(),loggers);
        courseManager.add(course);
        courseManager.add(course2);
        courseManager.add(course2);
        courseManager.add(course3);
        courseManager.update(course4);
        courseManager.delete(course4);

        CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(),loggers);
        categoryManager.add(category1);
        categoryManager.add(category1);
        categoryManager.add(category2);

        InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(),loggers);
        instructorManager.add(instructor);
        instructorManager.add(instructor2);

    }
}










