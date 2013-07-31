package gradebook.model;


/**
 * Represents a category in a gradebook with a given weight and name
 * Can calculate average of the gradebook items in this category
 * Abstract method that deciphers which grades from the gradebook items
 * in the category the user wants to use
 *
 */
public class GradebookCategory {
    private String name;
    private int weight;
    public GradebookCategory(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
}
