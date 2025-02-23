import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LopHoc {
    private String tenLop;
    private ArrayList<SinhVien> listSinhVien;

    public LopHoc(String tenLop) {
        this.tenLop = tenLop;
        this.listSinhVien = new ArrayList<>();
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public void themSinhVien(SinhVien sinhVien) {
        listSinhVien.add(sinhVien);
    }

    public void xuat() {
        System.out.println("Ten lop: " + tenLop);
        System.out.println("Danh sach sinh vien: ");
        for (SinhVien sinhVien : listSinhVien) {
            sinhVien.xuat();
            System.out.println("--------------------------");
        }
        thongKeXepHang();
    }

    public void thongKeXepHang() {
        Map<String, Integer> rankCount = new HashMap<>();
        for (SinhVien sv : listSinhVien) {
            String rank = sv.getRank();
            rankCount.put(rank, rankCount.getOrDefault(rank, 0) + 1);
        }

        System.out.println("Thong ke xep hang trong lop " + tenLop + ":");
        System.out.println("- A: " + rankCount.getOrDefault("A", 0));
        System.out.println("- B: " + rankCount.getOrDefault("B", 0));
        System.out.println("- C: " + rankCount.getOrDefault("C", 0));
        System.out.println("- D: " + rankCount.getOrDefault("D", 0));
        System.out.println("- <D: " + rankCount.getOrDefault("<D", 0));
    }
}
