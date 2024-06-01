package com.mycompany.cotsmkpl;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author surya
 */
public class COTSMKPLTest {

    @Test
    public void testAddingItemsAndDisplaying() {
        Barang barang1 = new Barang("Pensil", 3, 4000);
        Barang barang2 = new Barang("Pulpen", 2, 7500);
        Barang barang3 = new Barang("Buku", 1, 20000);

        KeranjangBelanja keranjang = new KeranjangBelanja("Surya", 10);
        keranjang.setKodeOTP(111111);

        keranjang.tambahBarang(barang1);
        keranjang.tambahBarang(barang2);
        keranjang.hapusBarangTerakhir();
        keranjang.tambahBarang(barang3);

        assertEquals(keranjang.getJumlahElemen(), 2);
    }

    @Test
    public void testCheckout() {
        Barang barang1 = new Barang("Pensil", 3, 4000);
        KeranjangBelanja keranjang = new KeranjangBelanja("Surya", 10);
        keranjang.setKodeOTP(111111);
        keranjang.tambahBarang(barang1);

        assertDoesNotThrow(keranjang::checkout);
        assertEquals(keranjang.getJumlahElemen(), 0);
    }

    @Test
    public void testCheckout2() {
        Barang barang1 = new Barang("Pensil", 3, 4000);
        Barang barang2 = new Barang("Kertas", 2, 20000);

        KeranjangBelanja keranjang = new KeranjangBelanja("Surya", 10);
        keranjang.setKodeOTP(111111);

        keranjang.tambahBarang(barang1);
        keranjang.tambahBarang(barang2);

        assertEquals(keranjang.getJumlahElemen(), 2);
    }
}
