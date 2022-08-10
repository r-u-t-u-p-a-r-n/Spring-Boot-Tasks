package math.operation;

import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired; 

import math.operation.MathApp;

@RestController
public class AppController
{
    @Autowired
    MathApp mathApp ;

    @GetMapping("/getValues")
    public MathApp values()
    {
        return new MathApp(mathApp.getMax(),mathApp.getMin());
    }
}