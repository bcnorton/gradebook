package gradebook.model;

/**
 * Interface to dealing with gradebook item objects
 * and the database
 *
 */
public interface GradebookItemDatabase {
    void insertGradebookItem();
    void removeGradebookItem();
    void updateGradebookItem();
    void getGradebookItem();
    void createGradebookItem();
}
