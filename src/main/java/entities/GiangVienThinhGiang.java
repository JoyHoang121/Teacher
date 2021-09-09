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


    public String getCoQuanLamViec() {
        return coQuanLamViec;
    }

    @Override
    public void inputThongTinGV() {
        super.inputThongTinGV();
        System.out.println("Mời nhập cơ quan làm viêc");
        Scanner sc = new Scanner(System.in);
        this.coQuanLamViec = sc.nextLine();
    }

    @Override
    public int Luong() {
        int luong = 0;
        luong = getSoGioGiangDay() * 200000;

        return luong;
    }


}
