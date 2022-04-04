package com.rplbo.utsnota;

import java.util.Date;

public class Nota {
    private String nonota;
    private String notelpembeli;
    private Item items;
    private String namapembeli;

    public Nota(String nonota, String notelpembeli, String namapembeli, Item item) {
        this.nonota = nonota;
        this.notelpembeli = notelpembeli;
        this.items = item;
        this.namapembeli = namapembeli;
    }

    public String getNonota() {
        return this.nonota;
    }

    public void setNonota(String nonota) {
        this.nonota = nonota;
    }

    public String getNotelpembeli() {
        return this.notelpembeli;
    }

    public void setNotelpembeli(String notelpembeli) {
        this.notelpembeli = notelpembeli;
    }

    public Item getItem() {
        return this.items;
    }

    public void setItem(Item item) {
        this.items = item;
    }

    public String getNamapembeli() {
        return this.namapembeli;
    }

    public void setNamapembeli(String namapembeli) {
        this.namapembeli = namapembeli;
    }

    public void tampilNota() {
        System.out.println("NOTA PEMBELIAN");
        System.out.println("No Nota: " + this.nonota);
        System.out.println("Telp Pembeli: " + this.notelpembeli);
        Date today = new Date();
        System.out.println("Tgl: " + today);

    }

    public String hitungTotalBayar() {
        return null;
    }
}
