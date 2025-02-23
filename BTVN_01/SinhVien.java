import java.util.ArrayList;

public class SinhVien {
    private String firstName, lastName, date, address;
    private ArrayList<MonHoc> listMonHoc;

    public SinhVien(String firstName, String lastName, String date, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.date = date;
        this.address = address;
        this.listMonHoc = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDate() {
        return date;
    }

    public String getAddress() {
        return address;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void themMonHoc(MonHoc monHoc) {
        listMonHoc.add(monHoc);
    }

    public double getDiemTrungBinh() {
        if (listMonHoc.isEmpty()) return 0;
        double sum = 0;
        for (MonHoc monHoc : listMonHoc) {
            sum += monHoc.getDiem();
        }
        return sum / listMonHoc.size();
    }

    public String getRank() {
        double avg = getDiemTrungBinh();
        if (avg >= 8.5) return "A";
        if (avg >= 7.0) return "B";
        if (avg >= 5.5) return "C";
        if (avg >= 4.0) return "D";
        return "<D";
    }

    public void xuat() {
        System.out.println("Ho va ten: " + firstName + " " + lastName);
        System.out.println("Ngay sinh: " + date);
        System.out.println("Dia chi: " + address);
        System.out.println("Diem trung binh: " + getDiemTrungBinh() + " - Xep hang: " + getRank());
        System.out.println("Danh sach mon hoc:");
        for (MonHoc monHoc : listMonHoc) {
            System.out.println("- " + monHoc.getTenMonHoc() + ": " + monHoc.getDiem());
        }
    }
}
