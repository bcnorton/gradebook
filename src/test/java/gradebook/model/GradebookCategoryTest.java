package gradebook.model;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Test for GradebookCategory
 */
public class GradebookCategoryTest {
    @Test
    public void testGradebookCategoryWeight() {
        GradebookCategory hw = new GradebookCategory("hw", 2);
        assertEquals(2, (int) hw.getWeight());
    }
    @Test
    public void testGradebookCategoryName() {
        GradebookCategory hw = new GradebookCategory("hw", 2);
        assertEquals("hw", (String) hw.getName());
    }
}
