package com.example.checkbox;

public class Model {

    public Model(){

    }

    public int [] getCheckIds(){
        int ids []= new int[4];
        ids[0] = R.id.futbol;
        ids[1] = R.id.basket;
        ids[2] = R.id.tenis;
        ids[3] = R.id.voley;
        return ids;
    }

}
