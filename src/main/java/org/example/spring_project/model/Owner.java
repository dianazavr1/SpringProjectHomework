package org.example.spring_project.model;

public class Owner {
    private String name;

    public Owner(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    @Override
    public String toString(){
        return name;
    }
}
