package designpatterns.factory.factorymethod.v2;

public class BlackMan implements Human {
    @Override
    public void getColor() {
        System.out.println("黑色");
    }

    @Override
    public void talk() {
        System.out.println("我是黑人");

    }
}
