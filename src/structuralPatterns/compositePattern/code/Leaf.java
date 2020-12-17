package structuralPatterns.compositePattern.code;

public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        System.out.println("don't do anything");
    }

    @Override
    public void remove(Component component) {
        System.out.println("don't do anything");
    }

    @Override
    public void display() {
        System.out.println("this is a leaf(" + name + ")");
    }
}
