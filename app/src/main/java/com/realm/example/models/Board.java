package com.realm.example.models;

import java.util.Date;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

public class Board extends RealmObject{

    @PrimaryKey
    private int id;
    @Required
    private String title;
    @Required
    private Date createdAt;

    //Con esto creamos la relación
    private RealmList<Note> notes;

    private Board(){}

    private Board(String title){
        this.id = 0;
        this.title = title;
        this.notes = new RealmList<Note>();
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public RealmList<Note> getNotes() {
        return notes;
    }

}
