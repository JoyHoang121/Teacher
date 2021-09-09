package entities;

import java.util.Scanner;

public class GiangVienCoHuu extends GiangVien {
    private int Luong, soGioDayToiThieu;



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
        System.out.println("Mời nhập số giờ dạy tối thiểu");
        this.soGioDayToiThieu = sc.nextInt();


    }

    @Override
    public int tinhLuong() {
        int luong = 0;
        if (this.soGioGiangDay > this.soGioDayToiThieu) {
            luong = (getSoGioGiangDay() - this.soGioDayToiThieu) * 200000 + this.Luong;
        }
        return luong;
    }
}
