/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitap1_04;

/**
 *
 * @author Nhan
 */
public class Main4 {
    public static void main(String[] args) {
        QuanLyChuyenXe qlChuyenXe = new QuanLyChuyenXe();

        Chuyenxe xeNoiThanh1 = new Chuyenxenoithanh("Van Gia - Nha Trang", 60 ," 01 ","Phung Van A", 01, 200000000);
        Chuyenxe xeNoiThanh2 = new Chuyenxenoithanh("Van Gia - Ninh Hoa", 30 ," 02 ","Phung Van B", 01, 100000000);
        Chuyenxe xeNoiThanh3 = new Chuyenxenoithanh("Ninh Hoa - Nha Trang", 30 ," 03 ","Phung Van C", 01, 100000000);

        qlChuyenXe.themChuyenXe(xeNoiThanh1);
        qlChuyenXe.themChuyenXe(xeNoiThanh2);
        qlChuyenXe.themChuyenXe(xeNoiThanh3);

        Chuyenxe xeNgoaiThanh1 = new ChuyenxeNgoaiThanh("Gia Lai", 1, "Gia Lai","Do Van Z", 02, 4000000);
        Chuyenxe xeNgoaiThanh2 = new ChuyenxeNgoaiThanh("Binh Dinh", 1, "Binh DInh","Do Van Y", 02, 6000000);
        Chuyenxe xeNgoaiThanh3 = new ChuyenxeNgoaiThanh("Ninh Thuan", 1, "Ninh Thuan","Do Van X", 02, 4000000);

        qlChuyenXe.themChuyenXe(xeNgoaiThanh1);
        qlChuyenXe.themChuyenXe(xeNgoaiThanh2);
        qlChuyenXe.themChuyenXe(xeNgoaiThanh3);

        qlChuyenXe.ShowInfoxe();

        // tong doanh thu xe noi thanh
        System.out.printf("\nTong doanh thu xe noi thanh: %.00f\n" , qlChuyenXe.tongDoanhThuNoiThanh());

        // tong doanh thu xe ngoai thanh
        System.out.printf("Tong doanh thu xe ngoai thanh: %.00f\n", qlChuyenXe.tongDoanhThuNgoaiThanh());

        // tong doanh thu
        System.out.printf("Tong doanh thu: %.00f\n", qlChuyenXe.tongDoanhThu());
    }
    
}
