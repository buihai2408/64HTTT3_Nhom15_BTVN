import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<LopHoc> danhSachLop = new ArrayList<>();

        // Tạo danh sách lớp
        LopHoc lop1 = new LopHoc("64CNTT1");
        LopHoc lop2 = new LopHoc("64HTTT3");

        // Thêm sinh viên vào lớp
        SinhVien sv1 = new SinhVien("Quan", "Tran", "22/05/1998", "123, Duong 1, Ha Noi");
        sv1.themMonHoc(new MonHoc("Lap trinh huong doi tuong", 8.5));
        sv1.themMonHoc(new MonHoc("Quan ly du an", 9.0));
        sv1.themMonHoc(new MonHoc("Hoc may", 7.5));
        sv1.themMonHoc(new MonHoc("Co so du lieu", 8.0));
        sv1.themMonHoc(new MonHoc("Lap trinh ung dung cho TBDD", 7.5));

        SinhVien sv2 = new SinhVien("Huy", "Nguyen", "12/12/1998", "456, Duong 2, Ha Noi");
        sv2.themMonHoc(new MonHoc("Lap trinh huong doi tuong", 7.5));
        sv2.themMonHoc(new MonHoc("Quan ly du an", 8.0));
        sv2.themMonHoc(new MonHoc("Hoc may", 8.5));
        sv2.themMonHoc(new MonHoc("Co so du lieu", 9.0));
        sv2.themMonHoc(new MonHoc("Lap trinh ung dung cho TBDD", 8.5));

        SinhVien sv3 = new SinhVien("Hieu", "Tran", "01/01/1999", "789, Duong 3, Ha Noi");
        sv3.themMonHoc(new MonHoc("Lap trinh huong doi tuong", 9.0));
        sv3.themMonHoc(new MonHoc("Quan ly du an", 8.5));
        sv3.themMonHoc(new MonHoc("Hoc may", 8.0));
        sv3.themMonHoc(new MonHoc("Co so du lieu", 7.5));
        sv3.themMonHoc(new MonHoc("Lap trinh ung dung cho TBDD", 8.0));

        SinhVien sv4 = new SinhVien("Hoa", "Nguyen", "02/02/1999", "101, Duong 4, Ha Noi");
        sv4.themMonHoc(new MonHoc("Lap trinh huong doi tuong", 8.0));
        sv4.themMonHoc(new MonHoc("Quan ly du an", 7.5));
        sv4.themMonHoc(new MonHoc("Hoc may", 8.0));
        sv4.themMonHoc(new MonHoc("Co so du lieu", 8.5));
        sv4.themMonHoc(new MonHoc("Lap trinh ung dung cho TBDD", 9.0));

        lop1.themSinhVien(sv1);
        lop1.themSinhVien(sv2);
        lop2.themSinhVien(sv3);
        lop2.themSinhVien(sv4);

        danhSachLop.add(lop1);
        danhSachLop.add(lop2);

        // In danh sách lớp học
        System.out.println("Danh sach lop hoc: ");
        for (LopHoc lop : danhSachLop) {
            System.out.println("- " + lop.getTenLop());
        }

        // Nhập tên lớp
        LopHoc lopHoc = null;
        while (lopHoc == null) {
            System.out.print("Nhap ten lop de xem thong tin: ");
            String tenLop = scanner.nextLine();

            // Tìm lớp theo tên
            for (LopHoc lop : danhSachLop) {
                if (lop.getTenLop().equalsIgnoreCase(tenLop)) {
                    lopHoc = lop;
                    break;
                }
            }

            if (lopHoc == null) {
                System.out.println("Lop khong ton tai. Vui long nhap lai.");
            }
        }

        lopHoc.xuat();  // Xuất thông tin lớp + thống kê xếp hạng sinh viên
        scanner.close();
    }
}
