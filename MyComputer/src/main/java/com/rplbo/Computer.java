package com.rplbo;

public class Computer {
    private int ID;
    private static int GlobalID = 1;
    private CableData cableData;
    Storage storage;

    public Computer(Storage storage){
        this.storage = storage;
        this.ID = GlobalID;
        GlobalID++;
    }

    public Storage getStorage(){
        return storage;
    }

    public int getID() {
        return ID;
    }

    public CableData getCableData() {
        return cableData;
    }
    public boolean detachCableData(){
        if (this.cableData == null){
            return false;
        }
        this.cableData = null;
        return true;
    }
    public boolean attachCableData(CableData kabel){
        if (this.cableData!=null){
            return false;
        }
        this.cableData = kabel;
        return true;
    }
    public boolean sendData(String data){
        if (cableData.getComputer1() == null){
            return false;
        }
        else if (cableData.getComputer2() == null){
            return false;
        }
        else {
            if (cableData.getComputer1().getID() == this.getID()){
                cableData.sendData(cableData.getComputer2(),  data);
                return true;
            }
            else if(cableData.getComputer2().getID() == this.getID()){
                cableData.sendData(cableData.getComputer1(),  data);
                return true;
            }
            else {
                return false;
            }
        }

    }
    public void retrieveData(String data){
        getStorage().addData(data);
    }
}