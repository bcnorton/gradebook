package gradebook.model;

/**
 * Interface to dealing with student objects
 * and the database
 *
 */
public interface StudentGradebookDatabase {
    void insertStudent();
    void removeStudent();
    void updateStudent();
    void getStudent();
    void createStudent();
}
