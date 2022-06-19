/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.poly.timetable;

/**
 *
 * @author Dell
 */
public class Subject {
    String MaHP, TenMon;
    Integer MaLop, BD, KT, Thu;

    public Subject() {
    }

    public Subject(String MaHP, String TenMon, Integer MaLop, Integer BD, Integer KT, Integer Thu) {
        this.MaHP = MaHP;
        this.TenMon = TenMon;
        this.MaLop = MaLop;
        this.BD = BD;
        this.KT = KT;
        this.Thu = Thu;
    }

    public String getMaHP() {
        return MaHP;
    }

    public void setMaHP(String MaHP) {
        this.MaHP = MaHP;
    }

    public String getTenMon() {
        return TenMon;
    }

    public void setTenMon(String TenMon) {
        this.TenMon = TenMon;
    }

    public Integer getMaLop() {
        return MaLop;
    }

    public void setMaLop(Integer MaLop) {
        this.MaLop = MaLop;
    }

    public Integer getBD() {
        return BD;
    }

    public void setBD(Integer BD) {
        this.BD = BD;
    }

    public Integer getKT() {
        return KT;
    }

    public void setKT(Integer KT) {
        this.KT = KT;
    }

    public Integer getThu() {
        return Thu;
    }

    public void setThu(Integer Thu) {
        this.Thu = Thu;
    }
    
    
    
}
