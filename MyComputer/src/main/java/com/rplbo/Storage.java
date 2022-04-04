package com.rplbo;

public class Storage {
    private String[] storage;
    public Storage(int ukuran){
        this.storage = new String[ukuran];
    }
    public String getData(int index){
        if (this.storage[index] == null){
            return String.valueOf(index);
        }
        return this.storage[index];
    }
    public int getSizeOfData(){
        return storage.length;
    }
    public boolean addData(String data){
        for (int i = 0; i <storage.length; i ++)
            if (storage[i] == null){
                storage[i] = data;
                return true;
            }
        return false;
    }

    public String toString(){
        for (int i = 0; i <storage.length; i ++){
            System.out.println(i+" : "+storage[i]);
        }
        return "Berhasil";
    }
}