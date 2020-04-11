/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1_02;
import BaiTap1_01.NhanVien;
import java.util.ArrayList;

/**
 *
 * @author Nhan
 */
public class QuanLyNhanVien implements IQuanLy{
    //TAo Danh Sach
     ArrayList<NhanVien> dsNhanVien = new ArrayList<>();

    @Override
    public void them(NhanVien nv) {
        dsNhanVien.add(nv);
    }

    @Override
    public void ShowList() {
        dsNhanVien.forEach(nv -> System.out.println(nv.ShowInfo()));
    }
    
}
