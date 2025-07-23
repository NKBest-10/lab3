package com.example.lab3;

import java.util.Date;

public class Note {
    //Attribute
    String title ;
    String context;
    Date createdDate;

    //Method
    void getSummery(){
        System.out.println(title+":"+context+"("+createdDate+")");

    }

}

