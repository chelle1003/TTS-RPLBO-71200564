package com.rplbo;

public class Laptop extends Computer {
    Keyboard keyboard;
    Monitor monitor;

    public Laptop(Storage storage, Monitor monitor, Keyboard keyboard) {
        super(storage);
        this.keyboard = keyboard;
        this.monitor = monitor;
    }

    public void showDisplay() {
        this.monitor.display(this.storage);
    }
    public void retrieveData(double data){
        getStorage().addData(String.valueOf(data));
    }
}