package gradebook.model;

import java.util.Iterator;
/**
 *Sample grading scheme. with 90 being A
 */
public class SampleGradingScheme implements GradebookScheme {
    static final double HIGHESTSCORE = 100.0;
    static final double AGRADE = 90;
    static final double BGRADE = 80;
    static final double CGRADE = 70;
    static final double DGRADE = 60;
    private GradebookListDAO studentGrades;
    private Student student;
    private GradebookListDAO categories;
    public SampleGradingScheme(Student student) {
        this.student = student;
        studentGrades = student.getStudentsGrades();
        categories = new GradebookListDAO();
    }
    public void categoriesOfItems() {
        for (Iterator gradesIterator =
                studentGrades.iterator(); gradesIterator.hasNext();) {
            GradebookItem item = (GradebookItem)
                    gradesIterator.next();
            GradebookCategory categoryOfItem = item.getCategory();
            if (!(categories.contains(categoryOfItem))) {
                categories.add(categoryOfItem);
            }
        }
    }
    public double averageScore(Student student) {
        categoriesOfItems();
        double studentsAverage = 0;
        for (Iterator catIterator =
                categories.iterator(); catIterator.hasNext();) {
            GradebookCategory category = (GradebookCategory)
                   catIterator.next();
            int weight = category.getWeight();
            double catScore = 0;
            for (Iterator gradesIterator =
                    studentGrades.iterator(); gradesIterator.hasNext();) {
                GradebookItem item = (GradebookItem)
                        gradesIterator.next();
                if (item.getCategory() == category) {
                    catScore = catScore + item.getScore();
                }
            }
            studentsAverage = studentsAverage + catScore * (weight);
        }
        return studentsAverage / studentGrades.getSize();
    }
    public char letterGrade(double average) {
        if (average >= AGRADE) {
            return 'A';
        }
        if (average >= BGRADE && average < AGRADE) {
            return 'B';
        }
        if (average >= CGRADE && average < BGRADE) {
            return 'C';
        }
        if (average >= DGRADE && average < CGRADE) {
            return 'D';
        }
        return 'F';
    }
}
