package com.mycompany.cotsmkpl;

public class KeranjangBelanja {
    private String username;
    private int kodeOTP, maksElemenBarang, jumlahElemen;
    private Barang[] arrayBarang;

    public KeranjangBelanja(String username, int maksElemenBarang){
        this.username = username;
        this.maksElemenBarang = maksElemenBarang;
        this.arrayBarang = new Barang[maksElemenBarang];
        this.kodeOTP = 0;
        this.jumlahElemen = 0;
    }

    
    public int getJumlahElemen() {
        return jumlahElemen;
    }
    public void setUsername(String username) {
        if (username != null && !username.isEmpty()) {
            this.username = username;
        }
    }

    public void setKodeOTP(int kodeOTP) {
        if (kodeOTP > 0) {
            this.kodeOTP = kodeOTP;
        }
    }
    public void tambahBarang(Barang barang){
        if(jumlahElemen < maksElemenBarang){
            arrayBarang[jumlahElemen] = barang;
            jumlahElemen++;
        }
    }

    public void hapusBarangTerakhir(){
        if(jumlahElemen != 0){
            arrayBarang[jumlahElemen-1] = null;
            jumlahElemen--;
        }
    }

    private double hitungHargaTotal(){
        double harga = 0;
        for(Barang x : arrayBarang){
            if(x != null){
                harga += x.getHarga() * x.getKuantitas();
            }
        }
        return harga;
    }
    public void tampilkanDaftarBarang(){
        for (Barang x : arrayBarang){
            if(x != null){
                System.out.println(x.getNama() + " harga "+x.getHarga() + " sebanyak " + x.getKuantitas());
            }
        }
        System.out.println("Total harga sementara = " + hitungHargaTotal() + " rupiah");
    }
    public void checkout(){
        String otp = String.valueOf(kodeOTP);
        if(otp.length() == 6){
            System.out.println("\nTransaksi diproses, total pembayaran " + hitungHargaTotal() + " rupiah");
            this.arrayBarang = new Barang[this.maksElemenBarang];
            this.jumlahElemen = 0;
            System.out.println("Transaksi selesai, keranjang belanja di-reset");
        }else{
            System.out.println("Kode OTP salah, checkout dibatalkan");
        }
    }
}
