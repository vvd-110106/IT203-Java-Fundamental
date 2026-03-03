package src.Session16.MiniPrj.manager;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CustomerManager<T> {
    private Map<String, T> customerMap = new HashMap<String, T>();
    public void add(String key, T customer) {
        customerMap.put(key, customer);
    }

    public T get(String key) {
        return customerMap.get(key);
    }

    public Collection<T> getAll() {
        return customerMap.values();
    }
}
