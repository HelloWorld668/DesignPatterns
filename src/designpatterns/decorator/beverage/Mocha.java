package designpatterns.decorator.beverage;

public class Mocha extends Condiment{
    
    Beverage beverage;
    
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
    
    @Override
    public double cost() {
        return beverage.cost()+0.99;
    }
    
    @Override
    public String getDescription() {
        return beverage.getDescription()+",Mocha";
    }

}
