/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitap1_03;

/**
 *
 * @author Nhan
 */
public abstract class SinhVienPoly {
    public String NganhHoc;
    public String HoTen;

    public SinhVienPoly(String NganhHoc, String HoTen) {
        this.NganhHoc = NganhHoc;
        this.HoTen = HoTen;
    }
    public abstract double getDiem();
     public String getHocLuc() {
      if (this.getDiem() < 5) {
        return "Yeu";
      }
      if (this.getDiem() < 6.5) {
        return "Trung binh";
      }
      if (this.getDiem() < 7.5) {
        return "Kha";
      }
      if (this.getDiem() < 9) {
        return "Gioi";
      }
      return "Xuat sac";
    }

     // xuat thong tin sinh vien
     public void xuat() {
       System.out.println("Ho ten: " + this.HoTen   + ", nganh hoc: " + this.NganhHoc);
     }
}
