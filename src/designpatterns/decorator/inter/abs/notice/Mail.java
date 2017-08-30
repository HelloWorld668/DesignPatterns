package designpatterns.decorator.inter.abs.notice;

import designpatterns.decorator.inter.abs.Action;
import designpatterns.decorator.inter.abs.Notice;

public class Mail extends Notice{
    Action action;
    public Mail(Action action) {
        this.action = action;
    }
    @Override
    public void doAction() {
        action.doAction();
        System.out.println(action.getChange().getId()+"send Mail");
    }
}
