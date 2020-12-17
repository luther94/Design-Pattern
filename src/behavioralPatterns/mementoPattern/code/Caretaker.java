package behavioralPatterns.mementoPattern.code;

import java.util.Stack;

public class Caretaker {
    private Stack<Memento> mementos = new Stack<>();

    public void setMemento(Memento memento) {
        mementos.push(memento);
    }

    public Memento getMemento() {
        return mementos.peek();
    }

    public Memento getMementoAndRemove() {
        return mementos.pop();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < mementos.size(); i++) {
            builder.append(mementos.elementAt(i).toString());
        }
        return builder.toString();
    }
}
