package designpatterns.decorator;

import designpatterns.decorator.inter.Father;
import designpatterns.decorator.inter.abs.action.Assign;
import designpatterns.decorator.inter.abs.notice.Call;

public class Run {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Father action = new Assign(null);
        Father call = new Call(action);
//        Father mail = new Mail(call);
//        mail.doAction();
    }
}
