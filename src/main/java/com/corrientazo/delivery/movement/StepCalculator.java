package com.corrientazo.delivery.movement;

import com.corrientazo.delivery.bean.Coordenate;
import com.corrientazo.delivery.bean.Location;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Depending on the direction that the dron is facing the next step would create a movement over X or Y
 * this class calculates that step
 */
public class StepCalculator {
    //Depending on the direction, the dron would move one step on X or Y, either in the positive or
    //negative side, this maps contains the four possible steps
    private  static Map<Character, Coordenate> steps = Stream.of(new Object[][] {
            { 'N', new Coordenate(0, 1) },
            { 'O', new Coordenate(1, 0) },
            { 'S', new Coordenate(0, -1) },
            { 'P', new Coordenate(-1, 0) }
    }).collect(Collectors.toMap(data -> (Character) data[0], data -> (Coordenate) data[1]));

    /**
     * Using the possible steps, the current position and the direction this functions
     * performs a step in proper direction
     * @param movement The direction that the Dron is facing (N)
     * @param currentPosition the current coordenate of the Drone
     * @return new coordenate after movement
     */
    public static Coordenate calculateStep(Location location){
        Coordenate step = steps.get(location.getDirection());
        Coordenate currentPosition = location.getCoordenate();
        currentPosition.setX(currentPosition.getX()+step.getX());
        currentPosition.setY(currentPosition.getY()+step.getY());
        return currentPosition;
    }
}
