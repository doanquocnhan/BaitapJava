/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1_01;

/**
 *
 * @author Doan Quoc Nhan
 */
public class NhanVien {
    private String name;
    private int old;
    private String Address;
    private double Salary;
    private int Hour;
    // Constructor
    public NhanVien(String name, int old, String Address, double Salary, int Hour) {
        this.name = name;
        this.old = old;
        this.Address = Address;
        this.Salary = Salary;
        this.Hour = Hour;
    }

    public NhanVien() {
    }
    
    //Getter and Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    public int getHour() {
        return Hour;
    }

    public void setHour(int Hour) {
        this.Hour = Hour;
    }
    // Hien thi thong tin
    public String ShowInfo(){
     return "Ten: "+name+"; Tuoi: "+old+";  Dia Chi: " + Address
      + "; Tien Luong : " + Salary + "; Tong Gio Lam: " +Hour+ ";Tien Thuong: "+gif();
    
    }
    public double gif(){
        if (Hour >= 200) {
      return Salary * 0.2;
    } else if (Hour>= 100) {
      return Salary * 0.1;
    }
    return 0;
    }
}

