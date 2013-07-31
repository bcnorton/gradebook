package gradebook.model;

/**
 * Interface to dealing with grading scheme objects
 * and the database
 *
 */
public interface GradingSchemeDatabase {
    void insertGradingScheme();
    void removeGradingScheme();
    void updateGradingScheme();
    void getGradingScheme();
    void createGradingScheme();
}
