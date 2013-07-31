package gradebook.model;

/**
 * Interface to dealing with class objects
 * and the database
 *
 */
public interface ClassGradebookDatabase {
    void insertClass();
    void removeClass();
    void updateClass();
    void getTheClass();
    void createClass();
}
