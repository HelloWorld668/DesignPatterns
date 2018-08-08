package designpatterns.factory.factorymethod.v2;

public class WhiteManFactory extends  AbstractHumanFactory{
    @Override
    public Human createHuaman() {
        return new WhiteMan();
    }
}
