public class MonHoc {
    private String tenMonHoc;
    private double diem;

    public MonHoc(String tenMonHoc, double diem) {
        this.tenMonHoc = tenMonHoc;
        this.diem = diem;
    }

    public String getTenMonHoc() {
        return tenMonHoc;
    }

    public double getDiem() {
        return diem;
    }

    public void setTenMonHoc(String tenMonHoc) {
        this.tenMonHoc = tenMonHoc;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public void xuat() {
        System.out.println("Ten mon hoc: " + tenMonHoc);
        System.out.println("Diem: " + diem);
    }
}
