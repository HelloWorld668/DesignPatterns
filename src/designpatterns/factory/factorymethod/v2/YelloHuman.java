package designpatterns.factory.factorymethod.v2;

public class YelloHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("yello");
    }

    @Override
    public void talk() {
        System.out.println("I am yello man");
    }
}
