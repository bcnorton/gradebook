package gradebook.model;

import java.util.Iterator;

/**
 * Represents a section of a class, containing students
 * can calculate average score of section and letter grade
 * can also add students to the section
 */
public class Section {
    private GradebookListDAO studentsInSection;
    private Class classOfSection;
    public Section(Class classOfSection) {
        this.classOfSection = classOfSection;
        studentsInSection = new GradebookListDAO();
    }
    public Class getClassOfSection() {
        return classOfSection;
    }
    public void setClassOfSection(Class classOfSection) {
        this.classOfSection = classOfSection;
    }
    public GradebookListDAO getStudentsInSection() {
        return studentsInSection;
    }
    public void setStudentsInSection(GradebookListDAO studentsInSection) {
        this.studentsInSection = studentsInSection;
    }
    public void addStudentToSection(Student studentToAdd) {
        studentsInSection.add(studentToAdd);
    }
    public double getAverageScore() {
        double total = 0;
        for (Iterator sectionIterator =
                studentsInSection.iterator(); sectionIterator.hasNext();) {
            Student currStudent = (Student) sectionIterator.next();
            double studentAverage = currStudent.getAverageScore();
            total = total + studentAverage;
        }
        return total / studentsInSection.getSize();
    }
    public char getLetterGrade() {
        double total = 0;
        for (Iterator sectionIterator =
                studentsInSection.iterator(); sectionIterator.hasNext();) {
            Student currStudent = (Student) sectionIterator.next();
            char letterGrade = currStudent.getLetterGrade();
            total += GradeConversion.letterGradeToGPA(letterGrade);
        }
        double averageLetterGrade = total  / studentsInSection.getSize();
        return GradeConversion.gpaToLetterGrade(averageLetterGrade);
    }
}
