package behavioralPatterns.mementoPattern.code;

import java.awt.Point;

public class Memento {
    private Point point;
    private String id;

    public Memento(Point point, String id) {
        this.point = point;
        this.id = id;
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

    @Override
    public String toString() {
        return id + "[x="+ point.x + ",y=" + point.y + "]";
    }
}
