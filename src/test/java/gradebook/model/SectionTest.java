package gradebook.model;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
/**
 *tests section.java
 */
public class SectionTest {

    @Test
    public void getClassOfSectionTest() {
        Class aClass = new Class(new Course("Math", "math3001", 3001));
        Section aSection = new Section(aClass);
        assertEquals(aClass, (Class) aSection.getClassOfSection());
    }
    @Test
    public void addStudentToSectionTest() {
        Class aClass = new Class(new Course("Math", "math3001", 3001));
        Section aSection = new Section(aClass);
        Student aStudent = new Student("Dougie", aSection);
        aSection.addStudentToSection(aStudent);
        assertEquals(1, (int) aSection.getStudentsInSection().getSize());
    }
    @Test
    public void averageScoreSectionTest() {
        Course aCourse = new Course("Math", "math3001", 3001);
        Class aClass = new Class(aCourse);
        Section aSection = new Section(aClass);
        Student aStudent = new Student("whits", aSection);
        GradebookCategory hw = new GradebookCategory("hw", 1);
        GradebookItem  hw1 = new GradebookItem("hw1", hw, 70);
        aSection.addStudentToSection(aStudent);
        aStudent.addGradebookItem(hw1);
        aStudent.addGradebookItem(hw1);
        assertEquals(70, (double) aSection.getAverageScore(), .5);
    }
    @Test
    public void letterGradeASectionTest() {
        Course aCourse = new Course("Math", "math3001", 3001);
        Class aClass = new Class(aCourse);
        Section aSection = new Section(aClass);
        Student aStudent = new Student("whits", aSection);
        GradebookCategory hw = new GradebookCategory("hw", 1);
        GradebookItem  hw1 = new GradebookItem("hw1", hw, 95);
        aSection.addStudentToSection(aStudent);
        aStudent.addGradebookItem(hw1);
        aStudent.addGradebookItem(hw1);
        assertEquals(
                'A', (char) aStudent.getLetterGrade());
    }
    @Test
    public void letterGradeBSectionTest() {
        Course aCourse = new Course("Math", "math3001", 3001);
        Class aClass = new Class(aCourse);
        Section aSection = new Section(aClass);
        Student aStudent = new Student("whits", aSection);
        GradebookCategory hw = new GradebookCategory("hw", 1);
        GradebookItem  hw1 = new GradebookItem("hw1", hw, 85);
        aSection.addStudentToSection(aStudent);
        aStudent.addGradebookItem(hw1);
        aStudent.addGradebookItem(hw1);
        assertEquals(
                'B', (char) aStudent.getLetterGrade());
    }
    @Test
    public void letterGradeCSectionTest() {
        Course aCourse = new Course("Math", "math3001", 3001);
        Class aClass = new Class(aCourse);
        Section aSection = new Section(aClass);
        Student aStudent = new Student("whits", aSection);
        GradebookCategory hw = new GradebookCategory("hw", 1);
        GradebookItem  hw1 = new GradebookItem("hw1", hw, 75);
        aSection.addStudentToSection(aStudent);
        aStudent.addGradebookItem(hw1);
        aStudent.addGradebookItem(hw1);
        assertEquals(
                'C', (char) aStudent.getLetterGrade());
    }
    @Test
    public void letterGradeDSectionTest() {
        Course aCourse = new Course("Math", "math3001", 3001);
        Class aClass = new Class(aCourse);
        Section aSection = new Section(aClass);
        Student aStudent = new Student("whits", aSection);
        GradebookCategory hw = new GradebookCategory("hw", 1);
        GradebookItem  hw1 = new GradebookItem("hw1", hw, 65);
        aSection.addStudentToSection(aStudent);
        aStudent.addGradebookItem(hw1);
        aStudent.addGradebookItem(hw1);
        assertEquals(
                'D', (char) aStudent.getLetterGrade());
    }
    @Test
    public void letterGradeFSectionTest() {
        Course aCourse = new Course("Math", "math3001", 3001);
        Class aClass = new Class(aCourse);
        Section aSection = new Section(aClass);
        Student aStudent = new Student("whits", aSection);
        GradebookCategory hw = new GradebookCategory("hw", 1);
        GradebookItem  hw1 = new GradebookItem("hw1", hw, 5);
        aSection.addStudentToSection(aStudent);
        aStudent.addGradebookItem(hw1);
        aStudent.addGradebookItem(hw1);
        assertEquals(
                'F', (char) aStudent.getLetterGrade());
    }
}
