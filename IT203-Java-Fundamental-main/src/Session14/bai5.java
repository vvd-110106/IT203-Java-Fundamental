package src.Session14;

import java.util.TreeSet;
import java.util.Comparator;

class Patient {
    String name;
    int severity;
    int arrivalTime;

    public Patient(String name, int severity, int arrivalTime) {
        this.name = name;
        this.severity = severity;
        this.arrivalTime = arrivalTime;
    }

    @Override
    public String toString() {
        return "Bệnh nhân " + name + " (Mức " + severity + ", Đến lúc " + arrivalTime + ")";
    }
}

public class bai5 {
    public static void main(String[] args) {
        Comparator<Patient> triageComparator = new Comparator<Patient>() {
            @Override
            public int compare(Patient p1, Patient p2) {
                if (p1.severity != p2.severity) {
                    return Integer.compare(p1.severity, p2.severity);
                }
                return Integer.compare(p1.arrivalTime, p2.arrivalTime);
            }
        };

        TreeSet<Patient> triageQueue = new TreeSet<>(triageComparator);
        triageQueue.add(new Patient("A", 3, 800));
        triageQueue.add(new Patient("B", 1, 815));
        triageQueue.add(new Patient("C", 1, 805));

        System.out.println("--- THỨ TỰ XỬ LÝ CẤP CỨU ---");
        for (Patient p : triageQueue) {
            System.out.println(p);
        }
    }
}
