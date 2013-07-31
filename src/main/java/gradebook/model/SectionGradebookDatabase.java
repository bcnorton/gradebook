package gradebook.model;

/**
 * Interface to dealing with section objects
 * and the database
 *
 */
public interface SectionGradebookDatabase {
    void insertSection();
    void removeSection();
    void updateSection();
    void getSection();
    void createSection();
}
