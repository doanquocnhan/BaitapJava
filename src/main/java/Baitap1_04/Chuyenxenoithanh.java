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
public class Chuyenxenoithanh extends Chuyenxe{
    public  String Sotuyen;
    public  float  Sokm;

    public Chuyenxenoithanh(String Sotuyen, float Sokm) {
        this.Sotuyen = Sotuyen;
        this.Sokm = Sokm;
    }

    public Chuyenxenoithanh(String Sotuyen, float Sokm, String MaSoChuyen, String HoTenTX, int Soxe, float doanhthu) {
        super(MaSoChuyen, HoTenTX, Soxe, doanhthu);
        this.Sotuyen = Sotuyen;
        this.Sokm = Sokm;
    }


    public Chuyenxenoithanh() {
    }

    @Override
    public void Showinfo() {
        super.Showinfo();  
      System.out.println("tuyen: " + Sotuyen);
      System.out.println("so km di duoc: " + Sokm);
}
}
