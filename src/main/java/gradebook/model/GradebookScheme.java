package gradebook.model;

/**
 * Interface with methods that calculate average
 * score of the object and the letter grade of the object
 */
public interface GradebookScheme {
    double averageScore(Student student);
    char letterGrade(double grade);
}
