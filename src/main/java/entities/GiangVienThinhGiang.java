package entities;

import java.util.Scanner;

public class GiangVienThinhGiang extends GiangVien {
    private String coQuanLamViec;


    public GiangVienThinhGiang(String tenGV, String email, String diaChi, String soDienThoai, int soGioGiangDay, String coQuanLamViec) {
        super(tenGV, email, diaChi, soDienThoai, soGioGiangDay);
        this.coQuanLamViec = coQuanLamViec;

    }

    public GiangVienThinhGiang() {
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("GiangVienThinhGiang: ").append("\n");;
        super.getGiangVien(sb);
        sb.append(" coQuanLamViec: ").append(coQuanLamViec).append("\n");
        return sb.toString();
    }

    @Override
    public void inputThongTinGV() {
        super.inputThongTinGV();
        System.out.println("Mời nhập cơ quan làm viêc");
        Scanner sc = new Scanner(System.in);
        this.coQuanLamViec = sc.nextLine();
    }

    @Override
    public int tinhLuong() {
        int luong = 0;
        luong = this.soGioGiangDay * 200000;

        return luong;
    }


}
