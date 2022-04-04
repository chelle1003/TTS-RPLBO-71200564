package com.rplbo.utsnota;

public class Pulpen extends Barang {
    private String warna;

    public Pulpen(String deskripsi, int harga, int berat, String kodeBarang, String warna) {
        super(deskripsi, harga, berat, kodeBarang, warna);
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    @Override
    public void getInformasi() {
        super.getInformasi();
    }
}