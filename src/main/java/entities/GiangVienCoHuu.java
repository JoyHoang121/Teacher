package entities;

import java.util.Scanner;

public class GiangVienCoHuu extends GiangVien {
    private int Luong;


    public GiangVienCoHuu(String tenGV, String email, String diaChi, String soDienThoai, int soGioGiangDay, int soGioQuyDinh, int luong) {
        super(tenGV, email, diaChi, soDienThoai, soGioGiangDay);
        this.Luong = luong;
    }

    public GiangVienCoHuu() {
    }

    public void inputThongTinGV() {
        super.inputThongTinGV();
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập lương thỏa thuận");
        this.Luong = sc.nextInt();


    }

    @Override
    public int Luong() {
        int luong = 0;
        if (this.soGioGiangDay > 40) {
            luong = (getSoGioGiangDay() - 40) * 200000 + this.Luong;
        }
        return luong;
    }
}
