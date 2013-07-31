package gradebook.model;

import java.util.Iterator;

/**
 *Represents one class in a course. Contains list of sections
 *can calculate average class score, and letter grade
 *can also add sections to class
 */
public class Class {
    private GradebookListDAO classSections;
    private Course courseOfClass;
    public Class(Course courseOfClass) {
        this.courseOfClass = courseOfClass;
        classSections = new GradebookListDAO();
    }
    public Course getCourseOfClass() {
        return courseOfClass;
    }
    public void setCourseOfClass(Course courseOfClass) {
        this.courseOfClass = courseOfClass;
    }
    public GradebookListDAO getClassSections() {
        return classSections;
    }
    public void setClassSections(GradebookListDAO classSections) {
        this.classSections = classSections;
    }
    public void addSectionToClass(Section sectionAdded) {
        classSections.add(sectionAdded);
    }
    public double getAverageScore() {
        double total = 0;
        for (Iterator classIterator =
                classSections.iterator(); classIterator.hasNext();) {
            Section currSection = (Section) classIterator.next();
            double studentAverage = currSection.getAverageScore();
            total = total + studentAverage;
        }
        return total / classSections.getSize();
    }
    public char getLetterGrade() {
        double total = 0;
        for (Iterator classIterator =
                classSections.iterator(); classIterator.hasNext();) {
            Section currSection = (Section) classIterator.next();
            char letterGrade = currSection.getLetterGrade();
            total += GradeConversion.letterGradeToGPA(letterGrade);
        }
        double averageLetterGrade = total  / classSections.getSize();
        return GradeConversion.gpaToLetterGrade(averageLetterGrade);
    }
}
