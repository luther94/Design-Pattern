package behavioralPatterns.iteratorPattern.code;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate implements Aggregate {
    private List<User> list = new ArrayList<>();

    public ConcreteAggregate() {
        list.add(new User("luther0", 30));
        list.add(new User("luther1", 31));
        list.add(new User("luther2", 32));
        list.add(new User("luther3", 33));
    }

    @Override
    public Iterator<User> iterator() {
        return new ConcreteIterator(list);
    }
}
