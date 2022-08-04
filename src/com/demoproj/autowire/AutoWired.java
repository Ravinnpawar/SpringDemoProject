package com.demoproj.autowire;

public class AutoWired {
    CanAutowire canAutowire;

    AutoWired() {
        System.out.println("Autowired is created");
    }

    public CanAutowire getCanAutowire() {
        return canAutowire;
    }

    public void setCanAutowire(CanAutowire canAutowire) {
        this.canAutowire = canAutowire;
    }

    void print() {
        System.out.println("hello class Autowired!!");
    }

    public void display() {
        print();
        canAutowire.print();
    }
}
