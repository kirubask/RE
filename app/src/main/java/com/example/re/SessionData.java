package com.example.re;

import com.example.re.Modall.Products;

import java.util.ArrayList;

public class SessionData  {

    private static SessionData instance;



    private  ArrayList<Products> list = new ArrayList<>();

    public static SessionData getInstance() {
        if (instance == null) {
            instance = new SessionData();
        }
        return instance;
    }
    public ArrayList<Products> getList() {
        return list;
    }

    public void setList(ArrayList<Products> list) {
        this.list = list;
    }

}
