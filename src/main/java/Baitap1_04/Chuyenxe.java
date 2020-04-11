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
public class Chuyenxe {
    public String MaSoChuyen;
    public String HoTenTX;
    public int Soxe;
    public float doanhthu;
    // construction khong doi so
    public Chuyenxe() {
    }
    // construction co doi so
    public Chuyenxe(String MaSoChuyen, String HoTenTX, int Soxe, float doanhthu) {
        this.MaSoChuyen = MaSoChuyen;
        this.HoTenTX = HoTenTX;
        this.Soxe = Soxe;
        this.doanhthu = doanhthu;
    }
    // getter and setter

    public String getMaSoChuyen() {
        return MaSoChuyen;
    }

    public void setMaSoChuyen(String MaSoChuyen) {
        this.MaSoChuyen = MaSoChuyen;
    }

    public String getHoTenTX() {
        return HoTenTX;
    }

    public void setHoTenTX(String HoTenTX) {
        this.HoTenTX = HoTenTX;
    }

    public int getSoxe() {
        return Soxe;
    }

    public void setSoxe(int Soxe) {
        this.Soxe = Soxe;
    }

    public float getDoanhthu() {
        return doanhthu;
    }

    public void setDoanhthu(float doanhthu) {
        this.doanhthu = doanhthu;
    }
     
    public void Showinfo(){
        System.out.println("Ma so chuyen: "+ MaSoChuyen);
        System.out.println("Ho ten tai xe:"+ HoTenTX );
        System.out.println("So xe: "+Soxe );
        System.out.println("Doanh thu: "+doanhthu);
    };
    
}

