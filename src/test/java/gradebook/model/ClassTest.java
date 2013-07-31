package gradebook.model;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
/**
 *tests class.java
 */
public class ClassTest {

    @Test
    public void getCourseOfClasstest() {
        Course aCourse = new Course("Math", "math3001", 3001);
        Class aClass = new Class(aCourse);
        assertEquals(aCourse, (Course) aClass.getCourseOfClass());
    }
    @Test
    public void getSectionsOfClasstest() {
        Course aCourse = new Course("Math", "math3001", 3001);
        Class aClass = new Class(aCourse);
        aClass.addSectionToClass(new Section(aClass));
        assertEquals(1, (int) aClass.getClassSections().getSize());
    }
    @Test
    public void averageScoreClassTest() {
        Course aCourse = new Course("Math", "math3001", 3001);
        Class aClass = new Class(aCourse);
        Section aSection = new Section(aClass);
        Student aStudent = new Student("whits", aSection);
        GradebookCategory hw = new GradebookCategory("hw", 1);
        GradebookItem  hw1 = new GradebookItem("hw1", hw, 70);
        aSection.addStudentToSection(aStudent);
        aClass.addSectionToClass(aSection);
        aStudent.addGradebookItem(hw1);
        aStudent.addGradebookItem(hw1);
        assertEquals(70, (double) aClass.getAverageScore(), .5);
    }
    @Test
    public void letterGradeAClassTest() {
        Course aCourse = new Course("Math", "math3001", 3001);
        Class aClass = new Class(aCourse);
        Section aSection = new Section(aClass);
        Student aStudent = new Student("whits", aSection);
        GradebookCategory hw = new GradebookCategory("hw", 1);
        GradebookItem  hw1 = new GradebookItem("hw1", hw, 95);
        aSection.addStudentToSection(aStudent);
        aClass.addSectionToClass(aSection);
        aStudent.addGradebookItem(hw1);
        aStudent.addGradebookItem(hw1);
        assertEquals(
                'A', (char) aClass.getLetterGrade());
    }
    @Test
    public void letterGradeCClassTest() {
        Course aCourse = new Course("Math", "math3001", 3001);
        Class aClass = new Class(aCourse);
        Section aSection = new Section(aClass);
        Student aStudent = new Student("whits", aSection);
        GradebookCategory hw = new GradebookCategory("hw", 1);
        GradebookItem  hw1 = new GradebookItem("hw1", hw, 75);
        aSection.addStudentToSection(aStudent);
        aClass.addSectionToClass(aSection);
        aStudent.addGradebookItem(hw1);
        aStudent.addGradebookItem(hw1);
        assertEquals(
                'C', (char) aClass.getLetterGrade());
    }
    @Test
    public void letterGradeDClassTest() {
        Course aCourse = new Course("Math", "math3001", 3001);
        Class aClass = new Class(aCourse);
        Section aSection = new Section(aClass);
        Student aStudent = new Student("whits", aSection);
        GradebookCategory hw = new GradebookCategory("hw", 1);
        GradebookItem  hw1 = new GradebookItem("hw1", hw, 65);
        aSection.addStudentToSection(aStudent);
        aClass.addSectionToClass(aSection);
        aStudent.addGradebookItem(hw1);
        aStudent.addGradebookItem(hw1);
        assertEquals(
                'D', (char) aClass.getLetterGrade());
    }
    @Test
    public void letterGradeFClassTest() {
        Course aCourse = new Course("Math", "math3001", 3001);
        Class aClass = new Class(aCourse);
        Section aSection = new Section(aClass);
        Student aStudent = new Student("whits", aSection);
        GradebookCategory hw = new GradebookCategory("hw", 1);
        GradebookItem  hw1 = new GradebookItem("hw1", hw, 5);
        aSection.addStudentToSection(aStudent);
        aClass.addSectionToClass(aSection);
        aStudent.addGradebookItem(hw1);
        aStudent.addGradebookItem(hw1);
        assertEquals(
                'F', (char) aClass.getLetterGrade());
    }
}
