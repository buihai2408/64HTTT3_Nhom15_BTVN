package QLSV;

public class SinhVien {
    private String firstName;
    private String lastName;
    private String birthdate;
    private String address;
    private String classID;
    private double diemOOP;
    private double diemQLDA;
    private double diemHM;
    private double diemCSDL;
    private double diemMobile;

    public SinhVien(String firstName, String lastName, String birthdate, String address, String classID,
                    double diemOOP, double diemQLDA, double diemHM, double diemCSDL, double diemMobile) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdate = birthdate;
        this.address = address;
        this.classID = classID;
        this.diemOOP = diemOOP;
        this.diemQLDA = diemQLDA;
        this.diemHM = diemHM;
        this.diemCSDL = diemCSDL;
        this.diemMobile = diemMobile;
    }
    // tính điểm trung bình
    public double diemTB(){
        return (diemOOP+diemQLDA+diemHM+diemCSDL+diemMobile)/5.0;
    }
    //xếp loại
    //A: ≥ 8.5
    //B: 7.0 – 8.4
    //C: 5.5 – 6.9
    //D: 4.0 – 5.4
    //<D: < 4.0
    public char xepLoai(){
        double diemTrungBinh = diemTB();
        if (diemTrungBinh>=8.5){
            return 'A';
        }else if(diemTrungBinh>=7.0){
            return 'B';
        }else if(diemTrungBinh>=5.5){
            return 'C';
        }else if(diemTrungBinh >=4.0){
            return 'D';
        }else {
            return 'F';
        }
    }
    //  hiển thị thông tin sinh viên
    public void hienThi() {
        System.out.println("Ho va ten: " + firstName + " " + lastName);
        System.out.println("Ngay sinh: " + birthdate);
        System.out.println("Dia chi: " + address);
        System.out.println("Lop: " + classID);
        System.out.printf("Diem TB: %.2f | Xep loai: %c\n", diemTB(),xepLoai());
        System.out.println("-------------------------------");
    }
}
