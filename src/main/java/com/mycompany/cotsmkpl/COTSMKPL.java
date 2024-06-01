/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cotsmkpl;

/**
 *
 * @author surya
 */
public class COTSMKPL {

    public static void main(String[] args) {
        Barang barang1 = new Barang("Pensil", 3, 4000);
        Barang barang2 = new Barang("Pulpen", 2, 7500);
        Barang barang3 = new Barang("Buku", 1, 20000);

        KeranjangBelanja keranjang = new KeranjangBelanja("Surya", 10);
        keranjang.setKodeOTP(111111);
        keranjang.tambahBarang(barang1);
        keranjang.tambahBarang(barang2);
        keranjang.tambahBarang(barang3);
        keranjang.hapusBarangTerakhir();

        keranjang.tampilkanDaftarBarang();
        keranjang.checkout();

    }
}
