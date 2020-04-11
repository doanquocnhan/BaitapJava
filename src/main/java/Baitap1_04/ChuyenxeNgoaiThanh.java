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
public class ChuyenxeNgoaiThanh extends Chuyenxe{
     public String Noiden;
     public int songay;

    public ChuyenxeNgoaiThanh(String Noiden, int songay) {
        this.Noiden = Noiden;
        this.songay = songay;
    }

    public ChuyenxeNgoaiThanh(String Noiden, int songay, String MaSoChuyen, String HoTenTX, int Soxe, float doanhthu) {
        super(MaSoChuyen, HoTenTX, Soxe, doanhthu);
        this.Noiden = Noiden;
        this.songay = songay;
    }

   
    @Override
    public void Showinfo() {
        super.Showinfo();
        System.out.println("Noi den: "+ Noiden);
        System.out.println("So ngay: "+ songay);
       }
    }
