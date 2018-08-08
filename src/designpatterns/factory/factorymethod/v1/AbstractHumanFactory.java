package designpatterns.factory.factorymethod.v1;

public abstract class AbstractHumanFactory {
    public abstract <T extends  Human> T createHuman(Class<T> t);
}
