package gennadziy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class MessagePrinter implements MessageService{


    @Value ("${messagePrinter.into}")
     private int name;


    public int getName () {
        return name;
    }

    private MessageService service;
    public String getMessage () {
        return "Helo5645646";
    }
}