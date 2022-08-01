package com.demoproj;

public class Engine {
    String model;
    String type;
    String valve;


    public Engine() {
    }

    public Engine(String model, String type, String valve) {
        this.model = model;
        this.type = type;
        this.valve = valve;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValve() {
        return valve;
    }

    public void setValve(String valve) {
        this.valve = valve;
    }
}
