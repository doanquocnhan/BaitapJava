/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitap1_04;

import java.util.ArrayList;

/**
 *
 * @author Nhan
 */
public class QuanLyChuyenXe {
    public  ArrayList<Chuyenxe> dsChuyenXe = new ArrayList<>();
    public void themChuyenXe(Chuyenxe cx) {
      dsChuyenXe.add(cx);}
    
    public ArrayList<Chuyenxe> xuatDsChuyenXe() {
      return dsChuyenXe;}
    
     public void ShowInfoxe(){
      for(Chuyenxe cx : dsChuyenXe) {
        cx.Showinfo();
      }}
     
     public float tongDoanhThuNoiThanh() {
      float doanhThu = 0;
      for (Chuyenxe cx : dsChuyenXe) {
        if (cx instanceof Chuyenxenoithanh) {
          doanhThu += ((Chuyenxenoithanh) cx).doanhthu;
        }
      }
      return doanhThu;
    }
     public float tongDoanhThuNgoaiThanh(){
         float doanhThu = 0;
         for(Chuyenxe cx : dsChuyenXe){
             if(cx instanceof ChuyenxeNgoaiThanh){
             doanhThu +=((ChuyenxeNgoaiThanh) cx).doanhthu;
             }
         }
        return doanhThu;
     }
     public double tongDoanhThu() {
      double doanhThu = 0;
      for (Chuyenxe cx : dsChuyenXe) {
        doanhThu += cx.doanhthu;
      }
      return doanhThu;
    }
}
