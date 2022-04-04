package com.rplbo;

public class Smartphone extends Computer{
    TouchScreen touchScreen;
    public Smartphone(Storage storage, TouchScreen touchScreen){
        super(storage);
        this.touchScreen = touchScreen;
    }
    public void showDisplay(){
        this.touchScreen.display(this.storage);
    }
    public void retrieveData(int data) {
        getStorage().addData(String.valueOf(data));
    }
}