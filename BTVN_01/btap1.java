import java.util.*;

class Student {
    String firstName, lastName, birthDate, address, className;
    double oop, pm, ml, db, mobile;

    public Student(String firstName, String lastName, String birthDate, String address, String className,
                   double oop, double pm, double ml, double db, double mobile) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.address = address;
        this.className = className;
        this.oop = oop;
        this.pm = pm;
        this.ml = ml;
        this.db = db;
        this.mobile = mobile;
    }

    public double getAverage() {
        return (oop + pm + ml + db + mobile) / 5;
    }

    public String getRank() {
        double avg = getAverage();
        if (avg >= 8.5) return "A";
        else if (avg >= 7) return "B";
        else if (avg >= 5.5) return "C";
        else if (avg >= 4) return "D";
        else return "<D";
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " | Avg: " + getAverage() + " | Rank: " + getRank();
    }
}

class Class {
    String className;
    List<Student> students = new ArrayList<>();

    public Class(String className) {
        this.className = className;
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public void printStudents() {
        for (Student s : students) {
            System.out.println(s);
        }
    }

    public void printRankSummary() {
        int a = 0, b = 0, c = 0, d = 0, lessD = 0;
        for (Student s : students) {
            switch (s.getRank()) {
                case "A": a++; break;
                case "B": b++; break;
                case "C": c++; break;
                case "D": d++; break;
                default: lessD++; break;
            }
        }
        System.out.println("A: " + a + ", B: " + b + ", C: " + c + ", D: " + d + ", <D: " + lessD);
    }
}

public class btap1 {
    public static void main(String[] args) {
        Map<String, Class> classes = new HashMap<>();

        Class cntt1 = new Class("CNTT1");
        cntt1.addStudent(new Student("Nguyen", "An", "2002-01-01", "Hanoi", "CNTT1", 9, 8.5, 8, 8.5, 9));
        cntt1.addStudent(new Student("Le", "Binh", "2001-05-10", "HCMC", "CNTT1", 7, 7, 6.5, 7, 7));

        Class cntt2 = new Class("CNTT2");
        cntt2.addStudent(new Student("Tran", "Chi", "2002-09-20", "Danang", "CNTT2", 6, 6, 6, 6, 6));
        cntt2.addStudent(new Student("Pham", "Dung", "2001-03-03", "Hue", "CNTT2", 4, 5, 5, 4.5, 4));

        classes.put("CNTT1", cntt1);
        classes.put("CNTT2", cntt2);

        Scanner sc = new Scanner(System.in);
        System.out.println("Danh sach cac lop: CNTT1, CNTT2");
        System.out.print("Nhap ma lop de xem danh sach sinh vien và tong ket rank: ");
        String classCode = sc.nextLine();

        if (classes.containsKey(classCode)) {
            Class selectedClass = classes.get(classCode);
            selectedClass.printStudents();
            selectedClass.printRankSummary();
        } else {
            System.out.println("Lop khong ton tai!");
        }

        sc.close();
    }
}
