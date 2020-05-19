package com.example.demo.model;

public class GameCharacter {
    public int x, y;
    public String name, type;;
    public char gender;

    public GameCharacter(String name, char gender, String type){
        this.x = 5;
        this.y = 5;

        this.name = name; 
        this.gender = gender;
        this.type = type;
    }

    public String toString(){
        return this.name;
    }
}