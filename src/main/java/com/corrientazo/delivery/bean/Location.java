package com.corrientazo.delivery.bean;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * this class contains information about the coordenate and direction of the dron in a
 * given moment
 */
public class Location {

    //Depending on the direction, the dron would move one step on X or Y, either in the positive or
    private  static Map<Character, String> directionDictionary = Stream.of(new Object[][] {
            { 'N', " dirección Norte" },
            { 'O', " dirección Oriente"  },
            { 'S', " dirección Sur"  },
            { 'P', " dirección Poniente"  }
    }).collect(Collectors.toMap(data -> (Character) data[0], data -> (String) data[1]));

    private Coordenate coordenate;
    private char direction;

    public Location(int x, int y, char direction){
        this.coordenate = new Coordenate(x,y);
        this.direction = direction;
    }

    public Location(Coordenate coordenate, char direction){
        this.coordenate = coordenate;
        this.direction = direction;
    }

    public void setCoordenate(Coordenate coordenate) {
        this.coordenate = coordenate;
    }

    public void setDirection(char direction) {
        this.direction = direction;
    }

    public Coordenate getCoordenate() {
        return coordenate;
    }

    public char getDirection() {
        return direction;
    }

    @Override
    public String toString(){
        return coordenate.toString()+directionDictionary.get(direction);
    }
}
