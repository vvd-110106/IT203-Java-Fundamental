package src.Session16.MiniPrj.manager;

import java.util.LinkedList;
import java.util.Queue;

public class SpaService<T> {
    private Queue<T> queue = new LinkedList<T>();

    // thêm vào hàng đợi
    public void addToQueue(T item) {
        queue.offer(item);
    }

    // Thú cưng tiếp theo được phục vụ
    public T serveNext() {
        return queue.poll();
    }

    //Xem thú cưng được phục vụ tiếp theo
    public T peek() {
        return queue.peek();
    }
}
