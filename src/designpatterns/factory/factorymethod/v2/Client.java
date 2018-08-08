package designpatterns.factory.factorymethod.v2;

public class Client {
    public static void main(String[] args) {
        AbstractHumanFactory factory = new WhiteManFactory();
        Human huaman = factory.createHuaman();
        huaman.getColor();
        huaman.talk();
    }
}
