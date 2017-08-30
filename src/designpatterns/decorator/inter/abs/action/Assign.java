package designpatterns.decorator.inter.abs.action;

import designpatterns.decorator.inter.abs.Action;
import designpatterns.decorator.pojo.Change;

public class Assign extends Action{

    public Assign(Change change) {
        super(change);
    }
    @Override
    public void doAction() {
        System.out.println(change.getId()+"assign");
    }

}
