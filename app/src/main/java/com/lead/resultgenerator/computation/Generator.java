package com.lead.resultgenerator.computation;

public class Generator {


    private String name;
    private int android,ipc,web;

    public int totalMarks(){
        return android+ipc+web;
    }

    public Generator(String name, int android, int ipc, int web) {
        this.name = name;
        this.android = android;
        this.ipc = ipc;
        this.web = web;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAndroid() {
        return android;
    }

    public void setAndroid(int android) {
        this.android = android;
    }

    public int getIpc() {
        return ipc;
    }

    public void setIpc(int ipc) {
        this.ipc = ipc;
    }

    public int getWeb() {
        return web;
    }

    public void setWeb(int web) {
        this.web = web;
    }
}
