package designpatterns.factory.factorymethod.v1;

public class WhiteMan implements Human {
    @Override
    public void getColor() {
        System.out.println("白色");
    }

    @Override
    public void talk() {
        System.out.println("我是白人");
    }
}
