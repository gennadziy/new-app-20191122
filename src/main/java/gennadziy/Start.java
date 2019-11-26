package gennadziy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Date;

public class Start {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext (Application.class);
        MessagePrinter printer=context.getBean ( "messagePrinter",MessagePrinter.class );
        System.out.println (printer.getMessage ()+" # "+printer.getName ());
        TestMessage testMessage=context.getBean ( "testMessage",TestMessage.class );
        System.out.println (testMessage.getMessage () );
        Summa summa=context.getBean ( "summa",Summa.class );
        System.out.println (summa.summa () );
        System.out.println (summa.minus () );
    }
}
