package structuralPatterns.compositePattern.code;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
    public Composite(String name) {
        super(name);
    }
    private List<Component> components = new ArrayList<>();

    @Override
    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void remove(Component component) {
        component.remove(component);
    }

    @Override
    public void display() {
        System.out.print("this is a composite(" + name + "), has leaf : ");
        components.forEach(component -> System.out.print(component.name + " "));
    }
}
