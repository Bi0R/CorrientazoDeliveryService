package com.corrientazo.delivery.movement;

import com.corrientazo.delivery.bean.Location;
import org.junit.Assert;
import org.junit.Test;

public class OrderInstructionsPerformerTest {
    @Test
    public void testInstructionPerformer1(){
        String instructions="AAADAAIAADD";
        Location destiniy = new Location(2,5,'S');
        String report = OrderInstructionsPerformer.performInstructions(instructions);
        Assert.assertEquals(destiniy.toString(),report);
    }

    @Test
    public void testInstructionPerformer2(){
        String instructions="IAAADAA";
        Location destiniy = new Location(-3,2,'N');
        String report = OrderInstructionsPerformer.performInstructions(instructions);
        Assert.assertEquals(destiniy.toString(),report);
    }
}
