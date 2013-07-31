package gradebook.model;

/**
 * Interface to dealing with course objects
 * and the database
 *
 */
public interface CourseGradebookDatabase {
    void insertCourse();
    void removeCourse();
    void updateCourse();
    void getCourse();
    void createCourse();
}
