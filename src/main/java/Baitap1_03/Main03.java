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
public class Main03 {
    public static void main(String[] args) {
        SinhVienIT it = new SinhVienIT("Nguyen Van Phung"," Khoa hoc may tinh", 7, 8, 5);
        SinhVienBiz bz = new SinhVienBiz(8, 9, "CEO"," Nguyen Thi Huong");
        it.xuat();
        System.out.println("diem: " + it.getDiem());
        System.out.println("hoc luc: " + it.getHocLuc());
        bz.xuat();
        System.out.println("diem: " + bz.getDiem());
        System.out.println("hoc luc: " + bz.getHocLuc());
        
    }
      
   
}
