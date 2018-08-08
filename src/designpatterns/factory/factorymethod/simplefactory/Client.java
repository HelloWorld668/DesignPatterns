package designpatterns.factory.factorymethod.simplefactory;

public class Client {
    public static void main(String[] args) {
        BlackMan blackMan = SimpleHumanFactory.createHuman(BlackMan.class);
        blackMan.getColor();
        blackMan.talk();
    }
}
