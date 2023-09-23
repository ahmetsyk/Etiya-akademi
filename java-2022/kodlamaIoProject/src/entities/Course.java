package entities;

public class Course {
    private int courseId;
    private String courseName;
    private Category courseCategory;
    private Instructor courseInstructor;
    private double coursePrice;

    public Course() {

    }

    public Course(int courseId, String courseName, Category courseCategory, Instructor courseInstructor, double coursePrice) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseCategory = courseCategory;
        this.courseInstructor = courseInstructor;
        this.coursePrice = coursePrice;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Category getCourseCategory() {
        return courseCategory;
    }

    public void setCourseCategory(Category courseCategory) {
        this.courseCategory = courseCategory;
    }

    public Instructor getCourseInstructor() {
        return courseInstructor;
    }

    public void setCourseInstructor(Instructor courseInstructor) {
        this.courseInstructor = courseInstructor;
    }

    public double getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(double coursePrice) {
        this.coursePrice = coursePrice;
    }
}
