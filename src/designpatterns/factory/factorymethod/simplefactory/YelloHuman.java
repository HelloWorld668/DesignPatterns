package designpatterns.factory.factorymethod.simplefactory;

public class YelloHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("1yello");
    }

    @Override
    public void talk() {
        System.out.println("1I am yello man");
    }
}
