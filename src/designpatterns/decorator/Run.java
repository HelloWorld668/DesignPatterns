package designpatterns.decorator;

import designpatterns.decorator.inter.Father;
import designpatterns.decorator.inter.abs.Action;
import designpatterns.decorator.inter.abs.action.Assign;
import designpatterns.decorator.inter.abs.notice.Call;
import designpatterns.decorator.inter.abs.notice.Mail;

public class Run {
    public static void main(String[] args) {
        Father action = new Assign(null);
        Father call = new Call(action);
        Father mail = new Mail(call);
        mail.doAction();
    }
}
