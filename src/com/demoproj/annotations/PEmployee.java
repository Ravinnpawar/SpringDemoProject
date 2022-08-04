package com.demoproj.annotations;

public class PEmployee {
    String pName;

    public String getpName() {
        System.out.println("Permanent Employee Name: "+pName);
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }
}
