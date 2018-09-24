package com.example.myfirstapp.listview;

public class ListDataModel {

    private String name;
    private String details;

    public ListDataModel(String name, String details) {
        this.name = name;
        this.details = details;
    }

    public String getName () {
        return this.name;
    }

    public String getDetails () {
        return this.details;
    }

}
