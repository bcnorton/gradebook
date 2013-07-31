package gradebook.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
/**
 *tests student.java
 */
public class StudentTest {
    @Test
    public void getStudentNameTest() {
        Course aCourse = new Course("Math", "math3001", 3001);
        Class aClass = new Class(aCourse);
        Section aSection = new Section(aClass);
        Student aStudent = new Student("whits", aSection);
        assertEquals("whits", aStudent.getName());
    }
    @Test
    public void getStudentSectionTest() {
        Course aCourse = new Course("Math", "math3001", 3001);
        Class aClass = new Class(aCourse);
        Section aSection = new Section(aClass);
        Student aStudent = new Student("whits", aSection);
        assertEquals(aSection, aStudent.getSection());
    }
    @Test
    public void getStudentGradesTest() {
        Course aCourse = new Course("Math", "math3001", 3001);
        Class aClass = new Class(aCourse);
        Section aSection = new Section(aClass);
        Student aStudent = new Student("whits", aSection);
        GradebookCategory hw = new GradebookCategory("hw", 1);
        GradebookItem  hw1 = new GradebookItem("hw1", hw, 70);
        GradebookListDAO items = new GradebookListDAO();
        items.add(hw1);
        aStudent.addGradebookItem(hw1);
        assertEquals(items.getSize(),
                (int) aStudent.getStudentsGrades().getSize());
    }
    @Test
    public void averageScoreStudentTest() {
        Course aCourse = new Course("Math", "math3001", 3001);
        Class aClass = new Class(aCourse);
        Section aSection = new Section(aClass);
        Student aStudent = new Student("whits", aSection);
        GradebookCategory hw = new GradebookCategory("hw", 1);
        GradebookItem  hw1 = new GradebookItem("hw1", hw, 70);
        aStudent.addGradebookItem(hw1);
        aStudent.addGradebookItem(hw1);
        assertEquals(70, (double) aStudent.getAverageScore(), .5);
    }
    @Test
    public void letterGradeAStudentTest() {
        Course aCourse = new Course("Math", "math3001", 3001);
        Class aClass = new Class(aCourse);
        Section aSection = new Section(aClass);
        Student aStudent = new Student("whits", aSection);
        GradebookCategory hw = new GradebookCategory("hw", 1);
        GradebookItem  hw1 = new GradebookItem("hw1", hw, 95);
        aStudent.addGradebookItem(hw1);
        aStudent.addGradebookItem(hw1);
        assertEquals(
                'A', (char) aStudent.getLetterGrade());
    }
    @Test
    public void letterGradeBStudentTest() {
        Course aCourse = new Course("Math", "math3001", 3001);
        Class aClass = new Class(aCourse);
        Section aSection = new Section(aClass);
        Student aStudent = new Student("whits", aSection);
        GradebookCategory hw = new GradebookCategory("hw", 1);
        GradebookItem  hw1 = new GradebookItem("hw1", hw, 85);
        aStudent.addGradebookItem(hw1);
        aStudent.addGradebookItem(hw1);
        assertEquals(
                'B', (char) aStudent.getLetterGrade());
    }
    @Test
    public void letterGradeCStudentTest() {
        Course aCourse = new Course("Math", "math3001", 3001);
        Class aClass = new Class(aCourse);
        Section aSection = new Section(aClass);
        Student aStudent = new Student("whits", aSection);
        GradebookCategory hw = new GradebookCategory("hw", 1);
        GradebookItem  hw1 = new GradebookItem("hw1", hw, 75);
        aStudent.addGradebookItem(hw1);
        aStudent.addGradebookItem(hw1);
        assertEquals(
                'C', (char) aStudent.getLetterGrade());
    }
    @Test
    public void letterGradeDStudentTest() {
        Course aCourse = new Course("Math", "math3001", 3001);
        Class aClass = new Class(aCourse);
        Section aSection = new Section(aClass);
        Student aStudent = new Student("whits", aSection);
        GradebookCategory hw = new GradebookCategory("hw", 1);
        GradebookItem  hw1 = new GradebookItem("hw1", hw, 65);
        aStudent.addGradebookItem(hw1);
        aStudent.addGradebookItem(hw1);
        assertEquals(
                'D', (char) aStudent.getLetterGrade());
    }
    @Test
    public void letterGradeFStudentTest() {
        Course aCourse = new Course("Math", "math3001", 3001);
        Class aClass = new Class(aCourse);
        Section aSection = new Section(aClass);
        Student aStudent = new Student("whits", aSection);
        GradebookCategory hw = new GradebookCategory("hw", 1);
        GradebookItem  hw1 = new GradebookItem("hw1", hw, 5);
        aStudent.addGradebookItem(hw1);
        aStudent.addGradebookItem(hw1);
        assertEquals(
                'F', (char) aStudent.getLetterGrade());
    }
}
