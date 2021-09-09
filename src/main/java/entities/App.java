package entities;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        ArrayList<GiangVien> giangViens = new ArrayList<>();
        ArrayList<GiangVienCoHuu> giangVienCH = new ArrayList<>();
        ArrayList<GiangVienThinhGiang> giangVienTG = new ArrayList<>();
        int soGV, choose, tongLuong = 0, luong = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập số lượng giảng viên của trường");
        soGV = sc.nextInt();
        for (int i = 0; i < soGV; i++) {
            System.out.println("Nhập thông tin giảng viên thứ 1: " + (i + 1) + ":");
            do {
                System.out.println("Mời nhập loại giảng viên (1- Giang Vien Cơ Hữu, 2 - Giang Viên thỉnh giảng");
                choose = sc.nextInt();
                switch (choose) {
                    case 1:
                        GiangVienCoHuu giangVienCoHuu = new GiangVienCoHuu();
                        giangVienCoHuu.inputThongTinGV();
                        giangViens.add(giangVienCoHuu);
                        giangVienCH.add(giangVienCoHuu);
                        break;
                    case 2:
                        GiangVienThinhGiang giangVienThinhGiang = new GiangVienThinhGiang();
                        giangVienThinhGiang.inputThongTinGV();
                        giangViens.add(giangVienThinhGiang);
                        giangVienTG.add(giangVienThinhGiang);
                        break;
                    default:
                        System.out.println("Chọn không hợp lệ");
                        break;
                }

            } while (choose < 1 || choose > 3);
        }
        System.out.println("Danh sách các giảng viên của trường");
        for (GiangVien gv1 : giangViens) {
            System.out.println(gv1);
            luong = gv1.tinhLuong();
            tongLuong += luong;
            System.out.println(" lương phải trả: " + luong);
        }
        System.out.println("Tổng lương phải trả cho tất cả Giảng Viên: " + tongLuong);
        System.out.println("-----------------------");

        System.out.println("Danh sách giảng viên Cơ Hữu: ");
        for (GiangVien gv1 : giangViens)  {
            if(gv1 instanceof GiangVienCoHuu)
            System.out.println(gv1);
        }
        System.out.println("-----------------------");
        System.out.println("Danh sách giảng viên Thỉnh Giảng: ");
//        for (GiangVienThinhGiang gvtg : giangVienTG) {
//            System.out.println(gvtg);
//        }
        for (GiangVien gv1 : giangViens)  {
            if(gv1 instanceof GiangVienThinhGiang)
                System.out.println(gv1);
        }

        System.out.println("-----------------------");
        int maxLuong = 0;
        String tenGV = "";
        for (GiangVien giangVien : giangViens) {
            if (giangVien.tinhLuong() > maxLuong) {
                maxLuong = giangVien.tinhLuong();
                tenGV = giangVien.getTenGV();
            }

        }
        System.out.println("Giang vien co luong cao nhất: " +  tenGV  + " Luong: " + maxLuong);
    }
}


