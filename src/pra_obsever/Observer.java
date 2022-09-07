package pra_obsever;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
