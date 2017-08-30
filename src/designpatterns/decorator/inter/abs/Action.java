package designpatterns.decorator.inter.abs;

import designpatterns.decorator.inter.Father;
import designpatterns.decorator.pojo.Change;

public abstract class Action extends Father{
    protected Change change;
    public Action(Change change) {
        this.change = change;
    }
    /**
     * @return the change
     */
    public Change getChange() {
        return change;
    }
    public abstract void doAction();
}
