package com.rplbo.utsnota;

public class KertasHVS extends Barang {
    private int gram;

    public KertasHVS( String kodeBarang,int harga, int berat,String deskripsi, int gram) {
        super( kodeBarang, harga, berat,deskripsi, String.valueOf(gram));
        this.gram = gram;
    }

    public int getGram() {
        return this.gram;
    }

    public void setGram(int gram) {
        this.gram = gram;
    }

    @Override
    public void getInformasi() {
        super.getInformasi();
    }
}