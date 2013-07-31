package gradebook.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
/**
 *tests GradebookItem.java
 */
public class GradebookItemTest {
    @Test
    public void gradebookItemScoreTest() {
        GradebookCategory hw = new GradebookCategory("hw", 1);
        GradebookItem  hw1 = new GradebookItem("hw1", hw, 70);
        assertEquals(
                70, (int) hw1.getScore());
    }

    @Test
    public void gradebookItemNameTest() {
        GradebookCategory hw = new GradebookCategory("hw", 1);
        GradebookItem  hw1 = new GradebookItem("hw1", hw, 70);
        assertEquals(
                "hw1", (String) hw1.getName());
    }

    @Test
    public void testGradebookItemCategory() {
        GradebookCategory hw = new GradebookCategory("hw", 1);
        GradebookItem  hw1 = new GradebookItem("hw1", hw, 70);
        assertEquals(
                hw, (GradebookCategory) hw1.getCategory());
    }
}
