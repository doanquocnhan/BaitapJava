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
public class SinhVienBiz extends SinhVienPoly{
    public double diemMarketing;
    public double diemSales;

    public SinhVienBiz(double diemMarketing, double diemSales, String NganhHoc, String HoTen) {
        super(NganhHoc, HoTen);
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

    @Override
    public double getDiem() {
      return (2 * this.diemMarketing + this.diemSales) /3;
      
    };

}