package designpatterns.factory.factorymethod.v2;

public class BlackManFactory extends AbstractHumanFactory{
    @Override
    public Human createHuaman() {
        return new BlackMan();
    }
}
