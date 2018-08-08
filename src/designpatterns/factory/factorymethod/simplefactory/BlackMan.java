package designpatterns.factory.factorymethod.simplefactory;

public class BlackMan implements Human {
    @Override
    public void getColor() {
        System.out.println("1黑色");
    }

    @Override
    public void talk() {
        System.out.println("1我是黑人");

    }
}
