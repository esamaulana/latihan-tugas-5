/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if11_10116467_latihanuts5;

/**
 *
 * @author Esa IF11 PBO11
 */
public class JajarGenjang implements BangunDatar {

    int luas;
    int keliling;
    final int sisiAB = 50, sisiBC = 60, sisiCD = 70, sisiDA = 80;
    int alas = 100, tinggi = 120;

    @Override
    public void hitungLuas() {
        luas = alas * tinggi;

        System.out.println("Luas Jajar genjang : " + luas);
    }

    @Override
    public void hitungKeliling() {
        keliling = sisiAB + sisiBC + sisiCD + sisiDA;

        System.out.println("Keliling Jajar Genjang : " + keliling);
    }
}
