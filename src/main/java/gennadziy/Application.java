package gennadziy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Date;

@Configuration
@PropertySource("classpath:messagePrinter.properties")
public class Application {

   @Bean
  public MessagePrinter messagePrinter(){
       return new MessagePrinter ();
   }

   @Bean
   public TestMessage testMessage(){
       return new TestMessage ();
   }
   @Bean
    public Summa summa(){
       return new Summa ();
   }
   @Bean
    public Date date(){
       return new Date (  );
   }

}
