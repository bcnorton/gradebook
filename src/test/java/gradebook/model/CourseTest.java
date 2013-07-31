package gradebook.model;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
/**
 *tests course.java
 */
public class CourseTest {

    @Test
    public void getSubjectCourseTest() {
        Course aCourse = new Course("Math", "math3001", 3001);
        assertEquals("Math", (String) aCourse.getSubject());
    }
    @Test
    public void getNameCourseTest() {
        Course aCourse = new Course("Math", "math3001", 3001);
        assertEquals("math3001", (String) aCourse.getName());
    }
    @Test
    public void getCourseNumberTest() {
        Course aCourse = new Course("Math", "math3001", 3001);
        assertEquals(3001, (int) aCourse.getCourseNumber());
    }
    @Test
    public void addPrereqsCourseTest() {
        Course aCourse = new Course("Math", "math3001", 3001);
        Course bCourse = new Course("Math", "math3002", 3002);
        aCourse.addPrereqCourse(bCourse);
        assertEquals(1, (int) aCourse.getPrereqCourses().getSize());
    }
    @Test
    public void addClassToCourseTest() {
        Course aCourse = new Course("Math", "math3001", 3001);
        aCourse.addClassToCourse(new Class(aCourse));
        assertEquals(1, (int) aCourse.getClassesInCourse().getSize());
    }
    @Test
    public void averageScoreCourseTest() {
        Course aCourse = new Course("Math", "math3001", 3001);
        Class aClass = new Class(aCourse);
        Section aSection = new Section(aClass);
        Student aStudent = new Student("whits", aSection);
        GradebookCategory hw = new GradebookCategory("hw", 1);
        GradebookItem  hw1 = new GradebookItem("hw1", hw, 70);
        aSection.addStudentToSection(aStudent);
        aClass.addSectionToClass(aSection);
        aCourse.addClassToCourse(aClass);
        aStudent.addGradebookItem(hw1);
        aStudent.addGradebookItem(hw1);
        assertEquals(70, (double) aCourse.getAverageScore(), .5);
    }
    @Test
    public void letterGradeACourseTest() {
        Course aCourse = new Course("Math", "math3001", 3001);
        Class aClass = new Class(aCourse);
        Section aSection = new Section(aClass);
        Student aStudent = new Student("whits", aSection);
        GradebookCategory hw = new GradebookCategory("hw", 1);
        GradebookItem  hw1 = new GradebookItem("hw1", hw, 95);
        aSection.addStudentToSection(aStudent);
        aClass.addSectionToClass(aSection);
        aCourse.addClassToCourse(aClass);
        aStudent.addGradebookItem(hw1);
        aStudent.addGradebookItem(hw1);
        assertEquals(
                'A', (char) aCourse.getLetterGrade());
    }
    @Test
    public void letterGradeCCourseTest() {
        Course aCourse = new Course("Math", "math3001", 3001);
        Class aClass = new Class(aCourse);
        Section aSection = new Section(aClass);
        Student aStudent = new Student("whits", aSection);
        GradebookCategory hw = new GradebookCategory("hw", 1);
        GradebookItem  hw1 = new GradebookItem("hw1", hw, 75);
        aSection.addStudentToSection(aStudent);
        aClass.addSectionToClass(aSection);
        aCourse.addClassToCourse(aClass);
        aStudent.addGradebookItem(hw1);
        aStudent.addGradebookItem(hw1);
        assertEquals(
                'C', (char) aCourse.getLetterGrade());
    }
    @Test
    public void letterGradeDCourseTest() {
        Course aCourse = new Course("Math", "math3001", 3001);
        Class aClass = new Class(aCourse);
        Section aSection = new Section(aClass);
        Student aStudent = new Student("whits", aSection);
        GradebookCategory hw = new GradebookCategory("hw", 1);
        GradebookItem  hw1 = new GradebookItem("hw1", hw, 65);
        aSection.addStudentToSection(aStudent);
        aClass.addSectionToClass(aSection);
        aCourse.addClassToCourse(aClass);
        aStudent.addGradebookItem(hw1);
        aStudent.addGradebookItem(hw1);
        assertEquals(
                'D', (char) aCourse.getLetterGrade());
    }
    @Test
    public void letterGradeFCourseTest() {
        Course aCourse = new Course("Math", "math3001", 3001);
        Class aClass = new Class(aCourse);
        Section aSection = new Section(aClass);
        Student aStudent = new Student("whits", aSection);
        GradebookCategory hw = new GradebookCategory("hw", 1);
        GradebookItem  hw1 = new GradebookItem("hw1", hw, 5);
        aSection.addStudentToSection(aStudent);
        aClass.addSectionToClass(aSection);
        aCourse.addClassToCourse(aClass);
        aStudent.addGradebookItem(hw1);
        aStudent.addGradebookItem(hw1);
        assertEquals(
                'F', (char) aCourse.getLetterGrade());
    }
}
