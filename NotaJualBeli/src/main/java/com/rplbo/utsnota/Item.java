package com.rplbo.utsnota;

public class Item {
    private KertasHVS krsmvs[];
    private BukuTulis bktulis[];
    private Pulpen pen[];

    public Item(BukuTulis[] bktulis, KertasHVS[] krsmvs, Pulpen[] pen) {
        this.krsmvs = krsmvs;
        this.bktulis = bktulis;
        this.pen = pen;
    }

    public Item(KertasHVS[] krsmvs, BukuTulis[] bktulis) {
        this.krsmvs = krsmvs;
        this.bktulis = bktulis;
    }

    public Item(KertasHVS[] krsmvs, Pulpen[] pen) {
        this.krsmvs = krsmvs;
        this.pen = pen;
    }

    public Item(BukuTulis[] bktulis, Pulpen[] pen) {
        this.bktulis = bktulis;
        this.pen = pen;
    }

    public int getJumlahBukuTulis(){
        return 0;
    }

    public int getJumlahPen(){
        return 0;
    }

    public int getJumlahKertasHVS(){
        return 0;
    }

    public KertasHVS[] getKrsmvs() {
        return this.krsmvs;
    }

    public BukuTulis[] getBktulis() {
        return this.bktulis;
    }

    public Pulpen[] getPen() {
        return this.pen;
    }

}
