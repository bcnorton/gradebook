package gradebook.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *Represents a data store type list
 *with an iterator, size, add
 *
 */
public class GradebookListDAO {
    private List<Object> gradebookList;
    public GradebookListDAO() {
        gradebookList = new ArrayList<Object>();
    }
    public Iterator iterator() {
        return gradebookList.iterator();
    }
    public int getSize() {
        return gradebookList.size();
    }
    public void add(Object o) {
        gradebookList.add(o);
    }
    public boolean contains(Object o) {
        return gradebookList.contains(o);
    }
}
