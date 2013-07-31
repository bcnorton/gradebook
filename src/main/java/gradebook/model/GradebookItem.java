package gradebook.model;

/**
 *Represents an item in a gradebook, with a score, name and the
 *category that it belongs to
 */
public class GradebookItem {
    private String name;
    private GradebookCategory category;
    private double score;
    public GradebookItem(
        String name, GradebookCategory category, double score) {
        this.name = name;
        this.category = category;
        this.score = score;
    }
    public double getScore() {
        return score;
    }
    public void setScore(double score) {
        this.score = score;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public GradebookCategory getCategory() {
        return category;
    }
    public void setCategory(GradebookCategory category) {
        this.category = category;
    }
}
