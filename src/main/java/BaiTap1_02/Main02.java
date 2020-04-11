/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1_02;

import BaiTap1_01.NhanVien;

/**
 *
 * @author Nhan
 */
public class Main02 {
    public static void main(String[] args) {
        IQuanLy qlNhanVien = new QuanLyNhanVien();

    // create nhan vien
        NhanVien nv1 = new NhanVien();
        nv1.setName("Nguyen Van Tien");
        nv1.setOld(20);
        nv1.setAddress("Van Gia");
        nv1.setSalary(7000000);
        nv1.setHour(100);
        

        NhanVien nv2 = new NhanVien();
        nv2.setName("Pham Thi Bich Thuong");
        nv2.setOld(19);
        nv2.setAddress("Van Thang ");
        nv2.setSalary(5000000);
        nv2.setHour(200);

        NhanVien nv3 = new NhanVien();
        nv3.setName("Nguyen Thi Mong Ngan");
        nv3.setOld(19);
        nv3.setAddress("Van Phuoc ");
        nv3.setSalary(5000000);
        nv3.setHour(200);

        NhanVien nv4 = new NhanVien();
        nv4.setName("Tran Thai Son");
        nv4.setOld(23);
        nv4.setAddress("Ninh Tay");
        nv4.setSalary(25000000);
        nv4.setHour(300);

        NhanVien nv5 = new NhanVien();
        nv5.setName("Doan Quoc Nhan ");
        nv5.setOld(24);
        nv5.setAddress("Nha Trang");
        nv5.setSalary(150000000);
        nv5.setHour(100);

        // add nhan vien list vao qlNhanVien
        qlNhanVien.them(nv1);
        qlNhanVien.them(nv2);
        qlNhanVien.them(nv3);
        qlNhanVien.them(nv4);
        qlNhanVien.them(nv5);

        // in danh sach nhan vien
        qlNhanVien.ShowList();
      }
        }

