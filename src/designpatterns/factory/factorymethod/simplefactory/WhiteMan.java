package designpatterns.factory.factorymethod.simplefactory;

public class WhiteMan implements Human {
    @Override
    public void getColor() {
        System.out.println("1白色");
    }

    @Override
    public void talk() {
        System.out.println("1我是白人");
    }
}
