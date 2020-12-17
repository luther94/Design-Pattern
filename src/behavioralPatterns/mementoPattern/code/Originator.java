package behavioralPatterns.mementoPattern.code;

import java.awt.Point;

public class Originator {
    private Point point;
    private String id;
    private String name;

    public Originator(String name) {
        this.name = name;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Memento save() {
        return new Memento(point, id);
    }

    public void restore(Memento memento) {
        this.point = memento.getPoint();
        this.id = memento.getId();
    }

    public void play(Caretaker caretaker, Point point, String id) {
        this.point = point;
        this.id = id;
        caretaker.setMemento(this.save());
        System.out.println(toString());
    }

    public void undo(Caretaker caretaker) {
        System.out.println(name + "悔棋了");
        restore(caretaker.getMementoAndRemove());
        restore(caretaker.getMemento());
    }

    @Override
    public String toString() {
        return id + "[x="+ point.x + ",y=" + point.y + "]";
    }
}
