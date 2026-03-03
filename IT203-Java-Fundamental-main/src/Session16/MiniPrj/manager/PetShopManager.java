package petKingDom.manager;

import java.util.ArrayList;
import java.util.List;

public class PetShopManager<T> {
    private List<T> items = new ArrayList<T>();

    public void add(T item) {
        items.add(item);
    }

    public void remove(T item) {
        items.remove(item);
    }

    public List<T> getAll() {
        return items;
    }
}
