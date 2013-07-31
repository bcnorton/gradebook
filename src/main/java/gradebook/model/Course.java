package gradebook.model;

import java.util.Iterator;

/**
 * Represents a course, with name subject and course number
 * Contains references to classes, and calculates own average score
 * and letter grade
 *
 */
public class Course {
    private String subject, name;
    private int courseNumber;
    private GradebookListDAO prereqCourses;
    private GradebookListDAO classesInCourse;
    public Course(String subject, String name, int courseNumber) {
        this.subject = subject;
        this.name = name;
        this.courseNumber = courseNumber;
        prereqCourses = new GradebookListDAO();
        classesInCourse = new GradebookListDAO();
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getSubject() {
        return subject;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }
    public int getCourseNumber() {
        return courseNumber;
    }
    public void setPrereqCourses(GradebookListDAO prereqCourses) {
        this.prereqCourses = prereqCourses;
    }
    public GradebookListDAO getPrereqCourses() {
        return prereqCourses;
    }
    public GradebookListDAO getClassesInCourse() {
        return classesInCourse;
    }
    public void setClassesInCourse(GradebookListDAO classesInCourse) {
        this.classesInCourse = classesInCourse;
    }
    public void addClassToCourse(Class classAdded) {
        classesInCourse.add(classAdded);
    }
    public void addPrereqCourse(Course prereq) {
        prereqCourses.add(prereq);
    }
    public double getAverageScore() {
        double total = 0;
        for (Iterator courseIterator =
                classesInCourse.iterator(); courseIterator.hasNext();) {
            Class curClass = (Class) courseIterator.next();
            double studentAverage = curClass.getAverageScore();
            total = total + studentAverage;
        }
        return total / classesInCourse.getSize();
    }
    public char getLetterGrade() {
        double total = 0;
        for (Iterator courseIterator =
                classesInCourse.iterator(); courseIterator.hasNext();) {
            Class curClass = (Class) courseIterator.next();
            char letterGrade = curClass.getLetterGrade();
            total += GradeConversion.letterGradeToGPA(letterGrade);
        }
        double averageLetterGrade = total  / classesInCourse.getSize();
        return GradeConversion.gpaToLetterGrade(averageLetterGrade);
    }
}
