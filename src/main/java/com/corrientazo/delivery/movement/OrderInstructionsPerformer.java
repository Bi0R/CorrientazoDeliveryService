package com.corrientazo.delivery.movement;

import com.corrientazo.delivery.bean.Location;
import com.corrientazo.delivery.exception.AddresOutOfDeliveryZoneException;

import java.util.ArrayList;
import java.util.List;

public class OrderInstructionsPerformer {
    private OrderInstructionsPerformer() {
    }

    /**
     * Takes the series of steps and performs them, but if the
     *
     * @param order all the steps to deliver the order
     * @return String with the final position
     */
    public static String performInstructions(String order) {
        Location origin = new Location(0, 0, 'N');
            char[] movements = order.toCharArray();
            for (char movement : movements) {
                origin = MovementPerformer.performMovement(origin, movement);
            }

        return origin.toString();
    }

}
