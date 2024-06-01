package com.mycompany.cotsmkpl;

public class Barang {
    private String nama;
    private int kuantitas;
    private double harga;

    public Barang(String nama, int kuantitas, double harga){
        this.nama = nama;
        this.kuantitas = kuantitas;
        this.harga = harga;
    }
    public Barang(String nama, double harga){
        this.kuantitas = 1;
        this.nama = nama;
        this.harga = harga;
    }

    public int getKuantitas() {
        return kuantitas;
    }

    public void setKuantitas(int kuantitas) {
        if(kuantitas > 0){
            this.kuantitas = kuantitas;
        }
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        if(harga > 0){
            this.harga = harga;
        }
    }

    public String getNama() {
        return nama;
    }
}
