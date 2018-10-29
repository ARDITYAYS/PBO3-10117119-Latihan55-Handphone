/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo310117119latihan55handphone;

/**
 *
 * @author Yogaputra
 * Nama                 : Arditya Yogaputra S
 * Kelas                : PBO3
 * NIM                  : 10117119
 * Deskripsi Program    : Program ini menampilkan list hp
 */
public class PBO310117119Latihan55Handphone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Android and = new Android("Samsung", "Android", "Grand", 3000000);
        and.displayProduct();
        and.setKeyStore("234ibfd3840fo");
        System.out.println("Andriod Key Store : " + and.getKeyStore());

        BlackBerry bb = new BlackBerry("BlackB", "RIM", "Curve", 2000000);
        bb.displayProduct();
        bb.setPinBB("BHS249");
        System.out.println("PIN : " + bb.getPinBB());

        WindowsPhone wp = new WindowsPhone("Nokia", "Win8", "Lumia", 1000000);
        wp.displayProduct();
        wp.setWpKeyStore("UUUQIJWORJ");
        System.out.println("WP Key Store : " + wp.getWpKeyStore());
    }

}
