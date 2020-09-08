package com.corrientazo.delivery.exception;

public class AddresOutOfDeliveryZoneException extends Exception{
    public AddresOutOfDeliveryZoneException(String errorMessage){
        super(errorMessage);
    }
}
