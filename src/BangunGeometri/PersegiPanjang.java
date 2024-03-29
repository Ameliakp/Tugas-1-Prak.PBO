/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunGeometri;

/**
 *
 * @author user
 */
public class PersegiPanjang implements MenghitungBidang {
    protected double panjang, lebar, luas, keliling;
    
    public PersegiPanjang() {
        
    }
    
    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double getLuas() {
        return luas;
    }

    public void setLuas(double luas) {
        this.luas = luas;
    }

    public double getKeliling() {
        return keliling;
    }

    public void setKeliling(double keliling) {
        this.keliling = keliling;
    }

    @Override
    public double Luas() {
         return panjang * lebar;
    }

    @Override
    public double Keliling() {
        return 2 * (panjang + lebar);
    }
    
    public void display() {
        System.out.println("");
    }
}
