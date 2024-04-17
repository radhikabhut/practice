package com.example.practice;

public class P_model {
    String name;
    String no;
    int img;

    public P_model(String name, String no, int img) {
        this.name = name;
        this.no = no;
        this.img = img;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String getNo() {return no;}
    public void setNo(String no) {this.no = no;}

    public int getImg() {return img;}

    public void setImg(int img) {this.img = img;
    }
}
