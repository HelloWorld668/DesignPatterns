package designpatterns.factory.factorymethod.v2;

public class YelloManFactory extends AbstractHumanFactory{
    @Override
    public Human createHuaman() {
        return new YelloHuman();
    }
}
