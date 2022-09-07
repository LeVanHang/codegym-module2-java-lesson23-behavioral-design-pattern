package pra_obsever;

import java.util.ArrayList;
import java.util.List;

import static jdk.javadoc.internal.tool.Main.execute;

public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private int state;

    public void add(Observer o) {
        observers.add(o);
    }

    public int getState() {
        return state;
    }

    public void setState(int value) {
        this.state = value;
        execute();
    }

    private void execute() {
        for (Observer obsever : observers) {
            obsever.update();
        }
    }
}
