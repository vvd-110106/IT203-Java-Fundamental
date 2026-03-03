package src.Session16.MiniPrj.manager;

import java.util.Stack;

public class ActivityLog {

    private Stack<String> logs = new Stack<String>();

    // Đưa thao tác vừa làm vào ngăn xếp
    public void push(String action) {
        logs.push(action);
    }

    // hoàn tác
    public void undo() {
        if (!logs.isEmpty()) {
            System.out.println("Undo: " + logs.pop());
        } else {
            System.out.println("Không có thao tác để hoàn tác.");
        }
    }

    // xem thao tác gần nhất
    public void showRecent() {
        if (!logs.isEmpty()) {
            System.out.println("Gần nhất: " + logs.peek());
        } else {
            System.out.println("Không có thao tác gần đây.");
        }
    }
}
