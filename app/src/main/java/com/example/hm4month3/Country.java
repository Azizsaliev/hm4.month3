package com.example.hm4month3;

public class Country {
private String name;
private int flag;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public Country(String name, int flag) {
        this.name = name;
        this.flag = flag;

    }
}
