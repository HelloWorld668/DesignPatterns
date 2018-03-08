package designpatterns.decorator.beverage;

public class Door {
    public static void main(String[] args) {
        Espresso espresso = new Espresso();
        
        Beverage mocha = new Mocha(espresso);
        
        System.out.println(mocha.cost()+" "+mocha.getDescription());
    }
}
