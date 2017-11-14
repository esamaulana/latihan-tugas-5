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
public class Segitiga implements BangunDatar {

    int luas, keliling;
    int alas = 100;
    int tinggi = 120;
    final int sisiAB = 50, sisiBC = 60, sisiCA = 70;

    @Override

    public void hitungLuas() {
        luas = (int) (0.5 * alas * tinggi);
        System.out.println("Luas Segitiga : " + luas);
    }

    @Override
    public void hitungKeliling() {
        keliling = sisiAB + sisiBC + sisiCA;
        System.out.println("Keliling Segitiga : " + keliling);
    }
}
