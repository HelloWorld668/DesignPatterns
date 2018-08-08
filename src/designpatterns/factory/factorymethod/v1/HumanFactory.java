package designpatterns.factory.factorymethod.v1;

public class HumanFactory extends AbstractHumanFactory{
    @Override
    public <T extends Human> T createHuman(Class<T> t) {
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
