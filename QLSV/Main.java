package QLSV;

import QLSV.LopHoc;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //tạo lớp
        LopHoc lop1 = new LopHoc("HTTT1");
        LopHoc lop2 = new LopHoc("HTTT2");
        //tạo sinh viên
        SinhVien sv1 = new SinhVien("Nguyen", "An", "01/01/2002", "Hanoi", "CNTT1",
                8.5, 7.5, 9.0, 8.0, 7.0);

        SinhVien sv2 = new SinhVien("Tran", "Binh", "12/05/2001", "Da Nang", "CNTT1",
                7.0, 6.5, 8.5, 7.5, 9.0);

        SinhVien sv3 = new SinhVien("Le", "Chi", "20/11/2003", "Ho Chi Minh", "CNTT1",
                9.0, 8.0, 7.5, 9.5, 8.5);
        //thêm SV vào lớp
        lop1.themSinhVien(sv1);
        lop1.themSinhVien(sv2);
        lop2.themSinhVien(sv3);

        //hien thi sanh sach lop
        System.out.println("DANH SACH CAC LOP");
        System.out.println("HTTT1");
        System.out.println("HTTT2");
        // Nhập mã lớp để hiển thị chi tiết
        System.out.print("Nhap ma lop: ");
        Scanner scanner = new Scanner(System.in);
        String maLop = scanner.nextLine();
        if (maLop.equals("HTTT1")) {
            lop1.hienThiDanhSach();
            lop1.thongKe();
        } else if (maLop.equals("HTTT2")) {
            lop2.hienThiDanhSach();
            lop2.thongKe();
        } else {
            System.out.println("Lop khong ton tai.");
        }

        scanner.close();
    }
}
