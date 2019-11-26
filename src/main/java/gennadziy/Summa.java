package gennadziy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Summa {
    @Value("${summa.a}")
    private int a;
    @Value("${summa.b}")
    private int b;

    public int summa (){
        return a+b;
    }
@Autowired
public int  minus(){
        return a-b ;
}

}
