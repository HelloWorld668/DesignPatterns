package designpatterns.factory.factorymethod.v1;

public class Client {
    public static void main(String[] args) {
        AbstractHumanFactory factor = new HumanFactory();
        YelloHuman yelloHuman = factor.createHuman(YelloHuman.class);
        yelloHuman.getColor();
        yelloHuman.talk();

        BlackMan blackMan = factor.createHuman(BlackMan.class);
        blackMan.getColor();
        blackMan.talk();
    }
}
