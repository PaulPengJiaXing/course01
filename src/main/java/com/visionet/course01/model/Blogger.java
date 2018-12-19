package com.visionet.course01.model;

public class Blogger {

    private long id;
    private String name;
    private String pass;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public String getPass() {
        return pass;
    }

    public Blogger(long id, String name, String pass) {
        this.id = id;
        this.name = name;
        this.pass = pass;
    }

    public Blogger() {
    }
}
