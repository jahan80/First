package com.jahan.model;

public class Person {
    private String name;
    private String family;
    //public int age;

    private boolean live ;
    public void setLive (boolean status) {
        this.live=status ;
    }
    public void setName (String name) {
        this.name=name ;
    }
   public String getName (){
        return name ;
   }


    public void setFamily (String family) {
        this.family=family ;
    }
}
