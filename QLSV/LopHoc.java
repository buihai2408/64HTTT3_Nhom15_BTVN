package QLSV;

import java.util.ArrayList;
import java.util.List;

public class LopHoc {
    private String maLop;
    private List<SinhVien> danhsachSV = new ArrayList<SinhVien>();

    public LopHoc(String maLop) {
        this.maLop = maLop;
    }
    // Thêm sinh viên vào lớp
    public void themSinhVien(SinhVien sv) {
        danhsachSV.add(sv);
    }
    // Hiển thị danh sách sinh viên
    public void hienThiDanhSach() {
        System.out.println("DANH SACH SINH VIEN - LOP : " + maLop);
        for (SinhVien sv : danhsachSV) {
            sv.hienThi();
        }
    }
    //thống kê
    public void thongKe(){
        int diemA=0, diemB=0,diemC=0,diemD=0,diemF=0;
        for(SinhVien sv : danhsachSV){
            char loai = sv.xepLoai();
            if(loai =='A'){
                diemA++;
            }else if(loai =='B'){
                diemB++;
            }else if(loai =='C'){
                diemC++;
            }else if(loai =='D'){
                diemD++;
            }else if(loai =='F'){
                diemF++;
            }
        }
        System.out.println("THONG KE LOP " +maLop);
        System.out.println("xep loai A : " + diemA);
        System.out.println("xep loai B : " + diemB);
        System.out.println("xep loai C : " + diemC);
        System.out.println("xep loai D : " + diemD);
        System.out.println("xep loai F: " + diemF);

    }

}
