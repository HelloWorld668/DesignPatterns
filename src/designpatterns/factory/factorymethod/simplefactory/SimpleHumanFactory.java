package designpatterns.factory.factorymethod.simplefactory;

public class SimpleHumanFactory {
    public static  <T extends Human> T createHuman(Class<T> t) {
        Human human = null ;
        try {
            human =(T)Class.forName(t.getName()).newInstance();
        } catch (Exception e) {
            System.out.println("生成人错误");
            e.printStackTrace();
        }
        return  (T)human;
    }
}
