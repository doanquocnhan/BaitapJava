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

    @Override
    public double getDiem() {
        public double diemMarketing;
    public double diemSales;

    // constructor
    public SinhVienBiz(String hoTen, String nganhHoc, double diemMarketing, double diemSales) {
      super(hoTen, nganhHoc);
      this.diemMarketing = diemMarketing;
      this.diemSales = diemSales;
    }

    // defined abstract method
    @Override
    public double getDiem() {
      return (2 * this.diemMarketing + this.diemSales) / 3;
    };

}
