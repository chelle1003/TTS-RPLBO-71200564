package com.rplbo;

public class CableData {
    private Computer computer1;
    private Computer computer2;

    public Computer getComputer1() {
        return computer1;
    }

    public Computer getComputer2() {
        return computer2;
    }

    public boolean attach(Computer pc){
        if (this.computer1 == null){
            this.computer1 = pc;
            return true;
        }
        else if (this.computer2 == null){
            this.computer2 = pc;
            return true;
        }
        else {
            return false;
        }
    }
    public boolean detach(Computer pc){
        int idTarget = pc.getID();
        if (this.computer1.getID() == idTarget){
            this.computer1 = null;
            return true;
        }
        else if (this.computer2.getID() == idTarget){
            this.computer2 = null;
            return true;
        }
        else {
            return false;
        }
    }
    public boolean sendData(Computer targetPC, String data){
        targetPC.retrieveData(data);
        return true;
    }
}