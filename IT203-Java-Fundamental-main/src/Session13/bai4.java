package src.Session13;

import java.util.LinkedList;

public class bai4 {
    private LinkedList<String> list = new LinkedList<>();

    public void patientCheckIn(String name) {
        list.addLast(name);
    }

    public void emergencyCheckIn(String name) {
        list.addFirst(name);
    }

    public void treatPatient() {
        if (!list.isEmpty()) {
            String name = list.removeFirst();
            if (name.equals("C")) {
                System.out.println("Đang cấp cứu: " + name);
            } else {
                System.out.println("Đang khám: " + name);
            }
        }
    }

    public static void main(String[] args) {
        bai4 er = new bai4();

        er.patientCheckIn("A");
        er.patientCheckIn("B");
        er.emergencyCheckIn("C");

        er.treatPatient();
        er.treatPatient();
        er.treatPatient();
    }
}
