package math.operation;

import org.springframework.boot.context.properties.ConfigurationProperties;  
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("findvalue")
public class MathApp
{
    private double max;
    private double min;
    
    public MathApp()
    {

    }
    
    public MathApp(double max, double min)
    {
        setMax(max);
        setMin(min);
    }

    public void setMax(double max)
    {
        this.max = max ;
    }

    public void setMin(double min)
    {
        this.min = min ;
    }

    public double getMax()
    {
        return (this.max>=this.min?this.max:this.min) ;
    }

    public double getMin()
    {
        return (this.max>=this.min?this.min:this.max) ;
    }
}