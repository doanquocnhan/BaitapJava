/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1_01;

/**
 *
 * @author Nhan
 */
public class Main {
    public static void main(String[] args) {
        NhanVien nv1 = new NhanVien();
        NhanVien nv2 = new NhanVien();
        nv1.setName("Nguyen Van Tien");
        nv1.setOld(20);
        nv1.setAddress("Van Gia");
        nv1.setSalary(7000000);
        nv1.setHour(100);
        
        nv2.setName("Pham Thi Bich Thuong");
        nv2.setOld(19);
        nv2.setAddress("Van Thang ");
        nv2.setSalary(5000000);
        nv2.setHour(200);

        System.out.println(nv1.ShowInfo());
        System.out.println(nv2.ShowInfo());
    }
    }
 