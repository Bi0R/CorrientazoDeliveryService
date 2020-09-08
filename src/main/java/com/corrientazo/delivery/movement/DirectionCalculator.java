package com.corrientazo.delivery.movement;

/**
 * This class uses concepts of modular arithmetic to achieve dron's rotatios
 */
public class DirectionCalculator
{
    private DirectionCalculator(){}
    //Array containing the possible directions: Norte->N, etc.
    private static char[] directions = {'N','O','S', 'P'};

    /**
     * Calculates the new direction of the dron based on the current Direction and
     * the rotation whether 'I' or 'D' (Izquierda/Left, Derecha/Right).
     * @param currentDirection the direction that the dron is currently facing.
     * @param rotation 'I' or 'D' depending on the instructions.
     * @return The new direction.
     */
    public static char calulateDirection(char currentDirection, char rotation){
        char direction = currentDirection;
        int currentIndex = getCurrentIndex(currentDirection);
        if(rotation=='D'){
            return rotateRight(currentIndex);
        }else if(rotation=='I'){
            return rotateLeft(currentIndex);
        }
        return direction;
    }

    /**
     * Returns the index of the current Direction in the Directions array.
     * @param currentDirection The direction that the dron is facing: N, O, S, P.
     * @return current index
     */
    private static int getCurrentIndex(char currentDirection){
        int index = 0;
        for (; index<directions.length; index++){
            if(directions[index]==currentDirection){
                return index;
            }
        }
        return index;
    }

    /**
     * Rotates the dron to the right by adding one to the current index, if it reaches the array
     * limit starts again.
     * @param currentIndex
     * @return the new Direction.
     */
    private static char rotateRight (int currentIndex){
        int newIndex = (currentIndex+1)%4;
        return directions[newIndex];
    }

    /**
     *  Rotates the dron to the right by adding one to the current index, if it reaches the array
     *  limit starts again.
     * @param currentIndex
     * @return the new Direction
     */
    private static char rotateLeft (int currentIndex){
        int newIndex = currentIndex-1;
        if(newIndex<0){
            newIndex = 4 + newIndex;
        }
        return directions[newIndex];
    }
}
