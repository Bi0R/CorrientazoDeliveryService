package com.corrientazo.delivery.bean;

public class Coordenate {
    private int x;
    private int y;

    public Coordenate(int x, int y){
        this.x=x;
        this.y=y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Coordenate) {
            Coordenate other = (Coordenate) obj;
            return this.x == other.getX() && this.y == other.getY();
        } else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "("+this.x+", "+this.y+")";
    }
}
