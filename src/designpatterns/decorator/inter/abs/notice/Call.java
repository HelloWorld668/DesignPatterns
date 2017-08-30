package designpatterns.decorator.inter.abs.notice;

import designpatterns.decorator.inter.Father;
import designpatterns.decorator.inter.abs.Action;
import designpatterns.decorator.inter.abs.Notice;

public class Call extends Notice{
    private Father action;
    public Call(Father action) {
        this.action = action;
    }
    @Override
    public void doAction() {
        action.doAction();
        System.out.println(action.getChange().getId()+"Call someone");
    }

}
