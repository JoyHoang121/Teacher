package entities;

import java.util.Scanner;

public class GiangVien {
    protected String tenGV, Email, diaChi, soDienThoai;
    protected int soGioGiangDay;

    public String getTenGV() {
        return tenGV;
    }

    public void setTenGV(String tenGV) {
        this.tenGV = tenGV;
    }

    public int getSoGioGiangDay() {
        return soGioGiangDay;
    }

    public void setSoGioGiangDay(int soGioGiangDay) {
        this.soGioGiangDay = soGioGiangDay;
    }

    public GiangVien(String tenGV, String email, String diaChi, String soDienThoai, int soGioGiangDay) {
        this.tenGV = tenGV;
        Email = email;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.soGioGiangDay = soGioGiangDay;
    }

    public GiangVien() {
    }

    public void inputThongTinGV() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập họ tên giảng viên");
        this.tenGV = sc.nextLine();
        System.out.println("Mời nhập Email");
        this.Email = sc.nextLine();
        System.out.println("Mời nhập địa chỉ");
        this.diaChi = sc.nextLine();
        System.out.println("Mời nhập số điện thoại");
        this.soDienThoai = sc.nextLine();
        System.out.println("Mời nhập số giờ giảng dạy");
        this.soGioGiangDay = sc.nextInt();
        setSoGioGiangDay(this.soGioGiangDay);


    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Giang Vien: ").append("\n");
        sb.append(" Tên Giang viên: ").append(tenGV).append("\n");
        sb.append(" Email: ").append(Email).append("\n");
        sb.append(" diaChi: ").append(diaChi).append("\n");
        sb.append(" soDienThoai: ").append(soDienThoai).append("\n");
        sb.append(" soGioGiangDay: ").append(soGioGiangDay);

        return sb.toString();
    }

    public int tinhLuong() {
        return 0;
    }
}
