package gradebook.model;

/**
 * Interface to dealing with gradebook category objects
 * and the database
 *
 */
public interface GradebookCategoryDatabase {
    void insertGradebookCategory();
    void removeGradebookCategory();
    void updateGradebookCategory();
    void getGradebookCategory();
    void createGradebookCategory();
}
