package com.corrientazo.delivery.movement;

import com.corrientazo.delivery.bean.Coordenate;
import com.corrientazo.delivery.bean.Location;

/**
 * Class that determines if a movement is a rotation or a step forwars
 */
public class MovementPerformer {

    private MovementPerformer(){}

    /**
     * This method determines if a movement is a rotation or a step forward
     * @param location Object that contains the current coordenates and direction
     * @param movement the next movement indicated by the instructions
     * @return the new Location
     */
    public static Location performMovement(Location location, char movement){
        if('D'==movement || 'I'==movement){
            char newDirection = DirectionCalculator.calulateDirection(location.getDirection(), movement);
            location.setDirection(newDirection);
        }else if('A' == movement){
            Coordenate newCoordenate = StepCalculator.calculateStep(location);
            location.setCoordenate(newCoordenate);
        }
        return location;
    }
}
